import java.util.*;
public class Prime_min_max {
    public static void main(String[] args) {
        int min,max,i,j,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter min and max values: ");
        min=sc.nextInt();
        max=sc.nextInt();
        for(i=min;i<=max;i++){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2) {
                System.out.print(i+" ");
            }
        }
    }
}
