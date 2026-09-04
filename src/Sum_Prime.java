import java.util.*;
public class Sum_Prime {
    public static void main(String[] args) {
        int num,r,i,sum=0,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        while(num>0){
            r=num%10;
            sum=sum+r;
            num=num/10;
        }
        System.out.println("Sum: "+sum);
        for(i=1;i<=sum;i++){
            if(sum%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
