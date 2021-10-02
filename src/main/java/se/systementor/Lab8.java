package se.systementor;

public class Lab8 {
    public void run(){
        System.out.print("Ange spelarnamn:");
        String input = System.console().readLine();

        if(input.equalsIgnoreCase("Mats Sundin")){
            System.out.println("Japp nr 13 var bäst");
        }
        else{
            System.out.println("Aldrig hört om den spelaren...");
        }


    }
    
}
