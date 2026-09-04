import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int n=num;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        n=num;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=Math.pow(ld,count);
            n=n/10;
        }
        if(sum==num){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
