class MyThread1 extends Thread{
    public void run(){
        System.out.println("Name of Child Thread: "+Thread.currentThread().getName());
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread: "+i);
        }
    }
}
public class ThreadNames {
    public static void main(String[] args) {
        MyThread1 t=new MyThread1();
        t.setName("John");
        t.start();
        System.out.println("Name of Main Thread: "+Thread.currentThread().getName());
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread: "+i);
        }
    }
}
