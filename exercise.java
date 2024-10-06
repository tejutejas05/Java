//package Exceptionexercise;
public class exercise {
    // public static int dividenum(int dividend,int divisor){
    //     if(divisor==0){
    //         throw new ArithmeticException("cannot divided by zero");
    //     }
    //     return dividend/divisor;
    // }
    public static void main(String args[]){
        try{
         //   int res=dividenum(5, 0);
            int n=10;
            int k=0;
            if(k==0){
                throw new ArithmeticException("cannot divided by zero");
            }
            int res=n/k;
            System.out.println("result:"+res);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
