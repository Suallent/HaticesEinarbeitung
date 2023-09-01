package main.hatices_zweite_woche.Übung_OOP;


public class OOP {
    int alter;
    String name,nachName, haarFarbe;

    public OOP(int alter, String name, String nachName, String haarFarbe){
        this.alter=alter;
        this.name = name;
        this.nachName = nachName;
        this.haarFarbe = haarFarbe;
    }

    public void vorstellung(){
        System.out.println("Hallo ich bin der " +name +" "+ nachName +" meine Haarfarbe ist "+ haarFarbe);
    }
    
    
}

