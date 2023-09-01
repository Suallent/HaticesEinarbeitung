package main.hatices_zweite_woche.Übung_Vererbung.Übung_zur_Übung;

public class Main {
    

    public static void main(String[] args) {
        
     Superklasse_Mitarbeiter ml = new Superklasse_Mitarbeiter("Thomas", "Rüdiger", 3425);
     Supklasse_Boss bl = new Supklasse_Boss("frank", "tugher", 9242, "Audi");
     Supklasse_Azubi al= new Supklasse_Azubi("Marie", "lirda", 800, 38, 40);

     System.out.println(al.arbeiten());
     bl.fuehren();

     Superklasse_Mitarbeiter ml2 = new Supklasse_Boss("Thomas", "Rüdiger", 3425, "Audi");

     Superklasse_Mitarbeiter dieM[] =  new Superklasse_Mitarbeiter[4];

     dieM[0] = ml;
     dieM[1] = bl;
     dieM[2] = al;
    
     dieM[3] = ml2;
     for(int i=0; i < dieM.length ; i++ ){
        System.out.println(dieM[i].arbeiten());
     }
    }
}
