package main.hatices_dritte_woche.Project_StonePaperScissors;

public class Main{

    public static void main(String[] args) {

        System.out.println("Welcome to Rock, Paper, scissors");
        System.out.println("Do you want to see the rules? answer with yes or no");
        Rules rulesClass = new Rules();
        rulesClass.rules();

        System.out.println("The Game begins, choose one: paper, scissor, rock");
        StartGame startGame = new StartGame();
        startGame.startGamePlay();

       
        
        
        
    }


   
    
}
