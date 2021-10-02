package se.systementor;

public class Lab3 {
    public void run(){
        System.out.print("Mata in en epostadress:");
        String input = System.console().readLine();

        boolean isValidEmail = false;
        if( input.indexOf('@') != -1 ){
            int lastDotIndex = input.lastIndexOf('.');
            if(lastDotIndex != -1){
                 int charsAfter = input.length() -  lastDotIndex - 1;
                 if(charsAfter == 2 || charsAfter == 3)
                    isValidEmail = true;              
            }
        }

        System.out.printf("%s is an %s emailaddress", input,
            isValidEmail ? "valid" : "invalid"        );
    }
    
}
