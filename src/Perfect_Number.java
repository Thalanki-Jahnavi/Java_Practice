import java.util.*;
public class Perfect_Number {
    public static void main(String[] args) {
        int num,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        for(i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
}
