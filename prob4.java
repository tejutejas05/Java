public class prob4{

    public static void check(String text){
        boolean containsvowels=false;
        String vowels="aieouAIEOU";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                containsvowels=true;
                break;
            }
        }
        if(!containsvowels){
            throw new NoVowelsException("String does not contain any vowels");
        }

    }
}
    class NoVowelsException extends Exception{
       public  NoVowelsException(String message){
            super(message);
        }
    }
    public static void main(String[] args){
        try{
        String txt="java handling and managing exception";
        System.out.println("original string:"+txt);
        check(txt);
        System.out.println("string contains vowels...");
        }
        catch(NoVowelsException e){
            System.out.println("error:"+e.getMessage());
        }

    }
