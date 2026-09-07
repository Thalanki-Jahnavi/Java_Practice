import java.io.*;
public class Exception1 {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("abc.txt");
            System.out.println("reading from file");
        }
        catch(FileNotFoundException e){
            System.out.println("check file is available or not");
        }
        System.out.println("rest of the program");
    }
}
