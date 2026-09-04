import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int num,r,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        int temp=num;
        while(num>0){
            r=num%10;
            rev=(rev*10)+r;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
