import java.util.*;
class customexception extends Exception{
   public  void met(){
    int a[]={1,2,4,5};
      int i=5;
      while(i>0){
        i--;
            Scanner sc =new Scanner(System.in);
            System.out.println("enter a number");
            int index=sc.nextInt();
            System.out.println("the value of array index" + index +"is "+ a[index]);
            break;
            
        
  
    }
}
}

public class practice {

    public static void main(String[] args) {
        customexception x=new customexception();
        try{
            throw new  customexception();
            x.met();
           
        }
        catch(Exception e ){
            System.out.println(e);
        }
    }
}

