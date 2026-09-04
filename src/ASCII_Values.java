import java.util.*;
public class ASCII_Values {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter a character: ");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int ASCII_Values=ch;
        System.out.println("ASCII Values for a given character: "+ASCII_Values);
    }
}
