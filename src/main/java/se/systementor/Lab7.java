package se.systementor;

public class Lab7 {
    public void run(){
        System.out.print("Mata in ett namn:");
        String input = System.console().readLine();

        String result = "";
        boolean first = true;
        boolean lastWasSpace = false;
        
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(first || lastWasSpace){
                result = result + Character.toUpperCase(ch);
            }
            else
                result = result + Character.toLowerCase(ch);

            lastWasSpace = ch == ' ';
            first = false;

            
        }

            

        System.out.printf("%s ->  %s\n",input, result);

    }    
    
}
