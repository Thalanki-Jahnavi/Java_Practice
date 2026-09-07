//prints default exception handler

import java.io.*;
public class Exception2 {
    public static void main(String[] args) throws FileNotFoundException {
        methodOne();
    }
    public static void methodOne() throws FileNotFoundException{
        methodTwo();
    }
    public static void methodTwo() throws FileNotFoundException{
        FileReader fr=new FileReader("abc.txt");
        System.out.println("readin from file");
        System.out.println("rest of the program");
    }
}
