package main.hatices_zweite_woche.Übung_Vererbung;

public class Main {
    public static void main(String[] args) throws Exception {


       MatheLehrer ml1 = new MatheLehrer("Thomas", "lehrer", 45);
       System.out.println("Mein name ist " + ml1.getName() + " ich bin " + ml1.getJob() + " und ich schreibe jedes jahr " + ml1.getMatheKlausuren() + " Klausuren");
       SportLehrer ml2 = new SportLehrer("Frank", "lehrer", "T-shirt, sportschuhe und sporthose");
       System.out.println("Mein name ist " + ml2.getName() + " ich bin " + ml2.getJob() + " und will das meine Schüler diese sportkleidung mitnehmen " + ml2.getSportKleidung());
       
       System.out.println(ml1);
       System.out.println(ml2);
      
       System.out.println(ml2.infoAnzeigen());


            
        
    }
}
