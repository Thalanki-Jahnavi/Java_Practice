import java.util.*;
public class Number_Table {
    public static void main(String[] args) {
        int num,i;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
