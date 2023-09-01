package main.hatices_zweite_woche.Übung_Vererbung;

public class MatheLehrer extends Mensch {

    private int matheKlausuren;

    public MatheLehrer(String name,String job, int matheKlausuren){
        super(name, job);
        this.matheKlausuren = matheKlausuren;
       

    }

   

    public int getMatheKlausuren() {
        return matheKlausuren;
    }

    
}
