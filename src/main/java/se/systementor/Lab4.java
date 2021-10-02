package se.systementor;

public class Lab4 {
    public void run(){
        System.out.print("Mata in en mening:");
        String input = System.console().readLine();

        String[] arrOfWords = input.split(" ");

        System.out.println("Antal ord blev " + arrOfWords.length);
        

    }
    
}
