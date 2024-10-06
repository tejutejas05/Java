public class finaly {
    // @SuppressWarnings("finally")
    // public static void  method(){
    //     int a=10;
    //     int b=05;
    //     try{
    //         int c=a/b;
           
    //         System.out.println("hell");
      
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }
    //     finally{
    //         System.out.println("ending...");
          
    //     }
    //   // return 0;
    //     }
    public static void main(String[] args) {
        int a=10;
        int b=10;
        while(true){
           
            try{
                int c=a/b;
          
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            //  finally{
                System.out.println("the value of b is :"+b);
            // }
            b--;
        }
        
    }
    
}
