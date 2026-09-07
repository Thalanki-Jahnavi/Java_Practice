import java.util.*;
public class Oned {
    public static void main(String[] args) {
        int size;
        System.out.print("Enter size: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int []a=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            System.out.print("Index Position of: "+i+" -> ");
            a[i]=sc.nextInt();
        }
        System.out.print("1D array elements are: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
