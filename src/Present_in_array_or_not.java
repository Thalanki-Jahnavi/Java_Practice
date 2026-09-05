import java.util.*;
public class Present_in_array_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int[] arr={10,20,30,40,50};
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("given number is present in an array");
        }
        else{
            System.out.println("given number is not present in an array");
        }
    }
}
