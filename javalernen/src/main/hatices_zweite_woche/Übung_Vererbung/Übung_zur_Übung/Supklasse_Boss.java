package main.hatices_zweite_woche.Übung_Vererbung.Übung_zur_Übung;

public class Supklasse_Boss extends Superklasse_Mitarbeiter{

    private String firmenWagen;

    public Supklasse_Boss(String name, String vorName, double gehalt,String firmenWagen){
        super(name,vorName,gehalt);
        this.firmenWagen = firmenWagen;
        
    }

    public void fuehren(){
     System.out.println("ich führe ");
    }


    
}
