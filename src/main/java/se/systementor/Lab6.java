package se.systementor;

public class Lab6 {
    public void run(){
        System.out.print("Mata in ett namn (fornamn efternamn):");
        String input = System.console().readLine();

        String []parts = input.split(" ");
        
        String result = parts[0].charAt(0) + "." + parts[1].charAt(0);

        System.out.printf("Initialierna för %s är %s\n",input, result);

    }    
    
}
