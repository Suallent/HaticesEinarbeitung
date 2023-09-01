package main.hatices_zweite_woche.Übung_Vererbung.Übung_zur_Übung;

public class Superklasse_Mitarbeiter {
    
    private String name,vorName;
    private double gehalt;

    public Superklasse_Mitarbeiter(String name, String vorName, double gehalt){

        this.name = name;
        this.vorName = vorName;
        this.gehalt = gehalt;

    }


    public String arbeiten(){
         return  "ich arbeite ";
    }

    public void pausieren(){
        System.out.print("ich pausiere");
    }

}
