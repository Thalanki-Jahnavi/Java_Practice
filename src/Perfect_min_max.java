import java.util.*;
public class Perfect_min_max {
    public static void main(String[] args) {
        int min,max,i,j,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter min and max values: ");
        min=sc.nextInt();
        max=sc.nextInt();
        for(i=min;i<=max/2;i++){
            sum=0;
            for(j=1;j<=i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){
                System.out.print(i+" ");
            }
        }
    }
}
