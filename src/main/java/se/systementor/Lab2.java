package se.systementor;

public class Lab2 {
    public void run(){
        String txt = "Detta är en sträng som du skall ändra";
        txt = txt.replace(' ', '*');
        
        int antalStars = 0;
        for(int i = 0; i < txt.length(); i++){
            if(txt.charAt(i) == '*')
            antalStars++;
        }

        System.out.printf("Det finns %s stjärnor\n", antalStars);
    }
}
