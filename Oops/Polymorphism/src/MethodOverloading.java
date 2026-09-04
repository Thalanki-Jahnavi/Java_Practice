class Test{
    void sum(){
        String str="apple is red and apple is sweet";
        String str2=str.replace("apple","cherry");
        System.out.println(str2);
    }
    void sum(int a){
        System.out.println("a = "+a);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Test t=new Test();
        t.sum();
        t.sum(100);
    }
}
