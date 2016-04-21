//package torpedo;
import java.util.Random;

public class map {
    field field[][] = new field[9][9];
    Random rand= new Random();
    
    public void map(){
        for(int i=0;i<field.length ;i++){
            for(int j=0;j<field[i].length;j++){
              this.field[i][j] = new field(false, false);
            }
        }
    }
    
    public void place(){
        map();
        for(int i = 2;i<=4;i++){
        int basepointX  = rand.nextInt(9);
        int basepointY  = rand.nextInt(9);
        
            if(basepointX<i){
                for(int j=i;j<0;j--){
                 //   System.out.println( this.field[3][3].getStatus());
                    this.field[j][basepointY].setStatus(true);
                }
            }
            else{
                if(basepointY<i){
                    for(int j=i;j<0;j--){
                        //System.out.println( this.field[3][3].getStatus());
                    this.field[basepointX][j].setStatus(true);
                    }
                }
                 else{
                    for(int j=0;j<i;j++){
                     //System.out.println( this.field[3][3].getStatus());
                     this.field[basepointX][j].setStatus(true);
                    }
                 }
            }        
        }    
    }  
    
    public void place_user(String fieldpoint){
        int x = Integer.parseInt(Character.toString(fieldpoint.charAt(0)));
        int y = Integer.parseInt(Character.toString(fieldpoint.charAt(1)));
        this.field[x][y].setStatus(true);
        this.field[x][y].setOpen(true);
    }
    
    public void attack_bot(){
        int x  = rand.nextInt(9);
        int y  = rand.nextInt(9);
       /* if(this.field[x][y].getOpen() == true ){
        
        }*/
        this.field[x][y].setOpen(true);
    }
    
    public void attack_user(String attack){
        int x = Integer.parseInt(Character.toString(attack.charAt(0)));
        int y = Integer.parseInt(Character.toString(attack.charAt(1)));
        this.field[x][y].setOpen(true);
    }

   public void print(){
       for(int i=0;i<=8;i++){
           for(int j=0;j<=8;j++){
               System.out.print(this.field[i][j].Output());
           }
           System.out.println();
       }
   }
   
   public boolean activ(){
       int count = 0;
    for(int i=0;i<field.length ;i++){
            for(int j=0;j<field[i].length;j++){
              if(this.field[i][j].getStatus() == true && this.field[i][j].getOpen() == true ){
               count++;
              }
            }
        }
        return count>= 8;
   }
}       
