public class prob2 {
    public static void trynum(int n){
        try{
            checkevennum(n);
            System.out.println(n+" even");
        }
        catch(IllegalArgumentException e){
            System.out.println("error:"+e.getMessage());
            System.out.println(e);
        }
    }
    public static void checkevennum(int number){
        if(number%2!=0){
            throw new IllegalArgumentException(number+" is odd");
        }
    }
    public static void main(String[] args) {
        int n=18;
        trynum(n);
        n=7;
        trynum(n);
    }
    
}
