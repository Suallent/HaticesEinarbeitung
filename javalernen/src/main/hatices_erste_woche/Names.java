package main.hatices_erste_woche;
public class Names {

    // public static void main(String[] args) throws Exception {

    // }

    private String name;

    public void setName (String x){
    this.name =x;

    if(name.length() > 2){
    System.out.println(name);
    }else{
    System.out.println("Your name: " + name + " isnt long enough, please try again");
    }

    }

}
