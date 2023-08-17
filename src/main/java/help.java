public class help {

    private String name;

    // public static void main (String[] args) throws Exception{

        

    // }

    public void setName (String x){
        this.name =x;

        if(name.length() > 2){
            System.out.println(name);
        }else{
            System.out.println("Your name: " + name + " isnt long enough, please try again");
        }
       
    }

    
}
