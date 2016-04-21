/*
Név: Turai Tibor Ádám
EHA: TUTWAAT.SZE
Feladat: 9. Torpedo
*/
//package torpedo;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        map map_user = new map();
        map map_bot = new map();
        map_user.map();
        map_bot.map();
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
                    System.out.println("Nem jó torpedópont!");
                }
            }
        }
        map_bot.place();
        boolean run = true;
        if(map_bot.activ()==true){
            run=false;
        System.out.println("A játéknak vége !");
        }
            while(run){
            System.out.println("bot:");
            map_bot.print();
            System.out.println("User:");
            map_user.print();

                System.out.println("Add meg a támadási kordinátát !");
                    InputStreamReader isr2 = new InputStreamReader(System.in);
                    BufferedReader br2  = new BufferedReader(isr2);
                    String attack;
                    try {
                        attack = br2.readLine();
                        map_bot.attack_user(attack);
                    } catch (IOException ex) {
                        System.out.println("Nem jó torpedópont!");
                    }
                map_user.attack_bot();
            }
    }
}
