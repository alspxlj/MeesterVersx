package week3.les06.practicum3;
import java.util.*;
import java.text.DecimalFormat;
//import java.math.RoundingMode;

public class Persoon {
	private String naam;
	private double budget;
	private ArrayList<Game> mijnGames;

	public Persoon(String nm, double bud){
		naam = nm;
		budget = bud;
		mijnGames = new ArrayList<Game>();
	}

	public boolean koop(Game g){
		boolean komtGameVoor = false;
		DecimalFormat tweeDecimaal = new DecimalFormat("#.00");
//		tweeDecimaal.setRoundingMode(RoundingMode.HALF_UP);
		
		for(Game game : mijnGames){
			if(game.equals(g) == true){
				komtGameVoor = true;
				break;
			}
		}

		if(budget < g.huidigeWaarde() || komtGameVoor == true){
			return false;
		}else{
			mijnGames.add(g);
			budget = Double.parseDouble(tweeDecimaal.format(budget - g.huidigeWaarde()));
			return true;
		}
	}

	public boolean verkoop(Game g, Persoon koper){
		boolean komtGameVoorVerkoper = false;
		boolean komtGameVoorKoper = false;
		DecimalFormat tweeDecimaal = new DecimalFormat("#.00");
//		tweeDecimaal.setRoundingMode(RoundingMode.HALF_UP);
		
		for(Game game : mijnGames){
			if(game.equals(g) == true){
				komtGameVoorVerkoper = true;
				break;
			}
		}
		
		for(Game game : koper.mijnGames){
			if(game.equals(g) == true){
				komtGameVoorKoper = true;
				break;
			}
		}
		
		if (komtGameVoorVerkoper == true) {
			if(koper.budget < g.huidigeWaarde() || komtGameVoorKoper == true) {
				return false;
			}else{
				koper.mijnGames.add(g);
				mijnGames.remove(g);

				budget = Double.parseDouble(tweeDecimaal.format(budget + g.huidigeWaarde()));
				koper.budget = Double.parseDouble(tweeDecimaal.format(koper.budget - g.huidigeWaarde()));
				return true;
			}
		}else{
			return false;
		}
	}

	public Game zoekGameOpNaam(String gameNaam){
		Game message = null;
		
		for(Game game : mijnGames){
			if(game.getNaam().equals(gameNaam)){
				 message = game;
				 break;
			}else{
				message = null;
			}
		}
		return message;
	}

	public String toString(){
		String message = naam + " heeft een budget van €" + budget + " en bezit de volgende games:\n";
		for (Game game : mijnGames){
			message = message + game;
		} 
		return message;
	}
}