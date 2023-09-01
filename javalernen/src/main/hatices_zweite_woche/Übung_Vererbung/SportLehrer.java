package main.hatices_zweite_woche.Übung_Vererbung;

public class SportLehrer extends Mensch  {

    private String sportKleidung;

    public SportLehrer (String name, String job,String sportKleidung){
        super(name,job);
        this.sportKleidung = sportKleidung;
       
    }

    public String infoAnzeigen(){
        return super.infoAnzeigen() +"SportKleidung: " + sportKleidung;
      }
    

    public String getSportKleidung() {
        return sportKleidung;
    }
    
}
// 