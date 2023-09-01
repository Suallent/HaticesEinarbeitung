package main.hatices_zweite_woche;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import main.hatices_zweite_woche.Übung_OOP.Traumhaus;

public class Arrays {
  public static void main(String[] args) throws Exception {

//  OOP denis = new OOP(17, "denis", "huger", "grün");
//  OOP Marie = new OOP(16, "Marie", "glas", "braun");

// denis.vorstellung();
// Marie.vorstellung();
   

Traumhaus infos= new Traumhaus(276, "grün, gelb, blau", "Kühlschrank, Fernsehr, Wlan");

infos.infosAusgeben();
    

}}

 // ArrayList <Integer> numbers = new ArrayList<Integer>();
    // Random number= new Random(System.currentTimeMillis());
    // for(int i = 0; i < 50; i++ ){
       
    //    numbers.add(number.nextInt(100));
      
    // }

    // if(numbers.contains(50)){
    //   System.out.println("Die nummer 50 ist vorhanden");
    // }else{
    //   System.out.println("Die nummer ist nicht voerhanden");
      
    // }
    //  for (int durschlauf : numbers ) {
    //   System.out.print(durschlauf + " ");
   
      
    // }


  // ArrayList<String> customers = new ArrayList<String>();

    // customers.add("Justin");

    // String Password;

    // Scanner userPassword = new Scanner(System.in);
    // Password = userPassword.nextLine();

    // if (Password.length() < 10) {
    //   System.out.println("Dein Passwort ist zu Kurz, mindestlänge ist 10");
    //   Password = userPassword.nextLine();
    //  }else{
    //   System.out.println("Dein Passwort ist lang genug");
    //  }
  
    

  // while(Password.length() < 10){
  //   System.out.println("Dein Passwort ist zu Kurz, mindestlänge ist 10");
  //   Password = userPassword.nextLine();
  // }



  public static double kosten;
  public static double bezahlt;
  public static void main(String[] args) {

      System.out.println("Dein Restbetrag liegt bei: " + restGeldRechner(bezahlt,kosten));
      

  }


  public static double restGeldRechner (double kosten, double bezahlt){

      System.out.println("Willkommen zum Restgeldrechner");

      System.out.println("Geben Sie die Kosten an");
      Scanner userKosten = new Scanner(System.in);
      kosten = userKosten.nextDouble();

      System.out.println("Geben Sie an wie viel Sie bezahlt haben");
      Scanner userBezahlt = new Scanner(System.in);
      bezahlt = userBezahlt.nextDouble();

      return bezahlt - kosten;

  }