class Test1{
    int a=40;
}
class Test2 extends Test1{
    int b=50;
}
public class Single_Inheritance2 {
    public static void main(String[] args) {
        Test2 t2=new Test2();
        // without using methods
        int result=t2.a+t2.b;
        System.out.println("Sum of 2 numbers: "+result);
    }
}
