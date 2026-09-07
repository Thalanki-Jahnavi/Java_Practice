import java.util.Scanner;

public class Delete_Element {
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter deleted element in array: ");
        int delete=sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if(delete!=arr[i]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
