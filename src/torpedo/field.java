//package torpedo;

public final class field {
 private boolean status;
 private boolean open;
 
 public field(boolean status, boolean open){
     setStatus(status);
     setOpen(open);
 }
 
 public void setStatus(boolean stat){
     this.status = stat;
 
 }
 
 public void setOpen(boolean open){
     this.open=open;
 }
 
 public boolean getStatus(){
     return this.status;
 }
 
 public boolean getOpen(){
     return this.open;
 }
 
 public String Output(){
     String resoult;
     
     if(open){
         if(status){
         resoult=" X";     
         }
         else{
         resoult="[.]";
         }
     }    
     else{
         resoult="[]";
     }
     
     return resoult;
 }
}
