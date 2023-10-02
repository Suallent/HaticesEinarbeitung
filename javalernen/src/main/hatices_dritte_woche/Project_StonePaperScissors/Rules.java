package main.hatices_dritte_woche.Project_StonePaperScissors;

import java.util.Scanner;

public class Rules {

    private static String userEingabe;
  

    public String rules(){
          
    Scanner eingabe = new Scanner(System.in);
    userEingabe = eingabe.nextLine();

       if(userEingabe.equals("yes")){

        System.out.println("Du wählst schere stein oder papier aus, der compurter wählt seine antwort, nachdem wird der sieger als sieger geehrt"); 

       }

       return "Keine richtige eingabe";
    }


    public String getUserEingabe() {
        return userEingabe;
    }

    public static void setUserEingabe(String userEingabe) {
        Rules.userEingabe = userEingabe;
    }
  
    
}


