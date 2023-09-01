package main.hatices_zweite_woche.Übung_OOP;

public class Traumhaus {


    private static int anzahlZimmer;
    private static String farbe,extras;
    
    public Traumhaus(int anzahlZimmer, String farbe, String extras){
    this.anzahlZimmer = anzahlZimmer;
    this.farbe = farbe;
    this.extras = extras;
       
    }

    
    public void getZimmer(int anzahlZimmer){
     this.anzahlZimmer=anzahlZimmer;
    }

    public int setZimmer(){
       return this.anzahlZimmer;
    }


    public  void getFarbe(String farbe){
    this.farbe=farbe;
    }

    public String setFarbe(){
        return this.farbe;
    }


    public void getExtras(String extras){
     this.extras=extras;
    }

    public String setExtras(){
        return this.extras;
    }

    public static void infosAusgeben(){
        System.out.println("unser Hotel hat " +anzahlZimmer+" Zimmer, erhältich in den Farben: " +farbe+ " und dazu noch unsere extras: "+extras);
    }
    
}
