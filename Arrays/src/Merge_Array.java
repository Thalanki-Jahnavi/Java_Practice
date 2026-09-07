import java.util.Scanner;

public class Merge_Array {
    public static void main(String[] args) {
        System.out.print("Enter array1 size: ");
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        System.out.print("Enter array2 size: ");
        int size2=sc.nextInt();
        int[] a=new int[size1];
        int[] b=new int[size2];
        System.out.println("Enter array1 elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter array2 elements: ");
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        int[] temp=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            temp[a.length+i]=b[i];
        }
        System.out.print("temp[]= {");
        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.print("}");
    }
}
