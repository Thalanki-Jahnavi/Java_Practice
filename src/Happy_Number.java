import java.util.*;
public class Happy_Number {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=0;i<num;i++){
            int sum=0;
            while(num>0){
                int ld=num%10;
                sum+=ld*ld;
                num=num/10;
            }
            num=sum;
        }
        if(num==1){
            System.out.println("happy Number");
        }
        else{
            System.out.println("Not a happy number");
        }
    }
}
