package torpedo;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Torpedo {

    public static void main(String[] args) {
        map map_user = new map();
        map map_bot = new map();
        
        for(int i=2;i<=4;i++){
            System.out.println("A "+ i +" méretű hajó kordinátáinak megadása:" );
            for(int j =1;j<=i;j++){
                System.out.println("Az "+j+" kordináta:");
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br  = new BufferedReader(isr);
                String number;
                try {
                    number = br.readLine();
                    map_user.place_user(number);
                } catch (IOException ex) {
                    //Logger.getLogger(Torpedo.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Nem jó torpedópont!");
                }
            }
        }
        map_bot.place();
        map_bot.print();
        map_user.print();
    }
    
}
