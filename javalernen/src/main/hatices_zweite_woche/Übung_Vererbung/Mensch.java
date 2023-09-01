package main.hatices_zweite_woche.Übung_Vererbung;



public class Mensch {


  private String job;


  public Mensch (String name , String job){
    this.name = name;
    this.job = job;

  }
  



  public String infoAnzeigen(){
    return "Hallo, mein Name ist: "+ name +" mein job ist "+ job;
  }

  private  String name;
  public String getName() {
    return name;
  }


  public String getJob() {
    return job;
  }

    // public static void main(String[] args) throws Exception {
  
      
 
     

    //  }
  
  
      
  
  }