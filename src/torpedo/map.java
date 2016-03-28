package torpedo;
import java.util.Random;

public class map {
    field field[][] = new field[9][9];
    Random rand= new Random();
    
    public void map(){
        for(int i=0;i<field.length ;i++){
            for(int j=0;j<field[i].length;j++){
                field[i][j] = new field(false, false);
            }
        }
    }
    
    public void place(){
        for(int i =2;i<=4;){
        int basepointX  = rand.nextInt(9);
        int basepointY  = rand.nextInt(9); 
        
            if(basepointX<i){
                for(int j=i;j<=0;j--){
                    field[j][basepointY].setStatus(true);
                }
            }
            else{
                if(basepointY<i){
                    for(int j=i;j<=0;j--){
                    field[basepointX][j].setStatus(true);
                    }
                }
                 else{
                    for(int j=0;j<=i;j++){
                     field[basepointX][j].setStatus(true);
                    }
                 }
            }        
        }    
    }  
    
    public void place_user(String fieldpoint){
        int x = Integer.parseInt(Character.toString(fieldpoint.charAt(1)));
        int y = Integer.parseInt(Character.toString(fieldpoint.charAt(2)));
        field[x][y].setStatus(true);
    }

   public void print(){
       for(int i=0;i<=9;i++){
           for(int j=0;j<=9;j++){
               System.out.println(field[i][j].Output());
           }
       }
   }
}       
