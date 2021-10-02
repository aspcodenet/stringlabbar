package se.systementor;

public class Lab1 {
    
    public void run(){
        
        int antalInmatadeNamn = 0;
        
        while(true){
            System.out.print("Skriv in ditt namn:");
            String namn = System.console().readLine();                
            if(namn.equals("EXIT")) 
                break;
            
            int length = namn.length();
            System.out.println("Namnet " + namn + " har " + length + " tecken");
            antalInmatadeNamn++;
        }

        System.out.printf("Hejdå du matade in totalt %d stycken ord\n", antalInmatadeNamn);

    }

}
