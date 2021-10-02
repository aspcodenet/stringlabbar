package se.systementor;


public class Lab5 {
    public void run(){
        System.out.print("Mata in ett ord:");
        String input = System.console().readLine();

        int position = 0;
        while(true){
            System.out.print("Mata in en poisition:");
            position = Integer.parseInt(System.console().readLine());

            if(position >= 0 && position < input.length())
                break;
        }                

        char ch = input.charAt(position);
        System.out.printf("Tecknet på position %d är %c", position, ch);
        

    }    
}
