public class App {
    public static void main(String[] args) throws Exception {
       
        
        System.out.println(positivnumber("34","56") );
       
    }
 



    
public static String positivnumber (String numberOne , String numberTwo){

    int numberOneInt= Integer.parseInt(numberOne);
    int numberTwoInt= Integer.parseInt(numberTwo);
   
    if(numberOneInt > 0 && numberTwoInt > 0 ){
    
        System.out.println("Die nummern sind beide positiv");
    }else if (numberOneInt < 0 && numberTwoInt < 0){
        System.out.println("Die unteren nummern sind beide Negativ");
    }else{
        System.out.println("Die unteren nummern sind unterschiedlich");
    };
 
    return numberTwo + " und " + numberOne;

}

  

            
    
}

