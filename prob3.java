import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class prob3 {
    public static void readFile(String filename) throws FileNotFoundException
    {
        File file=new File(filename);
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextLine()){
            String line=sc.nextLine();
            System.out.println(line);
            sc.close();
        }
       

    }
    public static void main(String[] args) {
        try{
            readFile("test1.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("error"+e.getMessage());
        }
        
    }
    
    
}
