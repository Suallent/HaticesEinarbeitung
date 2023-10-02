package main.hatices_dritte_woche.Project_StonePaperScissors;

import java.util.Random;
import java.util.Scanner;

public class StartGame {

    private static String[] choices = {"rock","paper","scissor"};

    private static String playerchoice;
    private static Random compurterChoice = new Random();

    public void startGamePlay (){

        Scanner choice = new Scanner(System.in);
        playerchoice = choice.nextLine();

        

        for(int i = 0; i < choices.length ; i++){
        if(playerchoice.equals(choices[i])){
            System.out.println("you have choosen "  + playerchoice );
            compurterChoice();
        }
       
    }

}

    public static void compurterChoice(){

      int randomChoice = compurterChoice.nextInt(choices.length);

      System.out.println("The NPC has choosen " + choices[randomChoice] );

     

      switch(playerchoice + choices[randomChoice]){
        case "rockpaper","paperscissor","scissorrock":
        System.out.println("You have won");
        break;

        case "rockrock","paperpaper","scissorscissor":
        System.out.println("its a draw");
        break;

        case "paperrock","scissorpaper","rockscissor":
        System.out.println("its a draw");
        break;

      }
        
    }
   

    
}


/*
 *  Stein < papier
 *  papier < schere
 *  schere < stein
 * 
 *  Stein = Stein
 *  papier = papier
 *  schere = scheren
 */