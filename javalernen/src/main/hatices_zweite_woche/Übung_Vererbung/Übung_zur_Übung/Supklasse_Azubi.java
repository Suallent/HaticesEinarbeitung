package main.hatices_zweite_woche.Übung_Vererbung.Übung_zur_Übung;

public class Supklasse_Azubi extends Superklasse_Mitarbeiter {

    private int arbeitsstunden;
    private int schulstunden;


    public Supklasse_Azubi(String name, String vorName,double gehalt,int arbeitsstunden, int schulstunden){
        super(name,vorName,gehalt);

        this.arbeitsstunden = arbeitsstunden;
        this.schulstunden = schulstunden;
    }


    public void lernen(){
        System.out.print("ich lerne ");
       
    }

    public String arbeiten (){
        return super.arbeiten() + arbeitsstunden + " stundenlang";
    }


    
}
