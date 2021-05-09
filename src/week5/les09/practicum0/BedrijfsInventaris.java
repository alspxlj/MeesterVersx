package week5.les09.practicum0;
import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<>();

    public BedrijfsInventaris(String nm, double bud){
        bedrijfsnaam = nm;
        budget = bud;
    }

    public void schafAan(Goed g){
        if (budget >= g.huidigeWaarde() && !alleGoederen.contains(g)) {
            budget = budget - g.huidigeWaarde();
            alleGoederen.add(g);
        }
    }

    public String toString(){
        String message = bedrijfsnaam + " met inventaris:\n";
        for (Goed g : alleGoederen) {
            message = message + g.toString();
        }
        return message;
    }
}