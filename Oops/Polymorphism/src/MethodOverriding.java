class Test1{
    void dis(){
        int[] arr={10,20,30};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of array: "+sum);
    }
}
class Test2 extends Test1{
    void  dis(){
        super.dis();
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("Sum = "+c);
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Test2 t=new Test2();
        t.dis();
    }
}
