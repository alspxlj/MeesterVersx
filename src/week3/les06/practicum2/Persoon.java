package week3.les06.practicum2;
import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

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
		tweeDecimaal.setRoundingMode(RoundingMode.CEILING);
		
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
			budget = budget - g.huidigeWaarde();
			return true;
		}
	}

	public boolean verkoop(Game g, Persoon koper){
		boolean komtGameVoorVerkoper = false;
		boolean komtGameVoorKoper = false;
		DecimalFormat tweeDecimaal = new DecimalFormat("#.00");
		tweeDecimaal.setRoundingMode(RoundingMode.CEILING);
		
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

				budget = budget + g.huidigeWaarde();
				koper.budget = koper.budget - g.huidigeWaarde();
				return true;
			}
		}else{
			return false;
		}
	}

	public String toString(){
		String message = naam + " heeft een budget van €" + budget + " en bezit de volgende games:\n";
		for (Game game : mijnGames){
			message = message + game;
		} 
		return message;
	}
}