class Test4 extends  Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
        }
    }
}
class Test5 extends  Thread{
    public void run(){
        for(int i=6;i<=10;i++){
            System.out.print(i+" ");
        }
    }
}
public class ThreadExample3 {
    public static void main(String[] args) {
        Test4 t4=new Test4();
        Test5 t5=new Test5();
        t4.start();
        t5.start();
    }
}
