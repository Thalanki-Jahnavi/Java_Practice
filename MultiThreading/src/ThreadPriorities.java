class MyThread2 extends Thread{
    public void run(){
        Thread t=Thread.currentThread();
        int priority=t.getPriority();
        System.out.println("Child Thread Priority: "+priority);
        for (int i=1;i<=5;i++){
            System.out.println("Child Thread: "+i);
        }
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        MyThread2 t2=new MyThread2();
        t2.setPriority(10);
        t2.start();
        Thread t1=Thread.currentThread();
        int priority=t1.getPriority();
        System.out.println("Main Thread Priority: "+priority);
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread: "+i);
        }
    }
}
