class MyThread4 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            Thread.yield();
            System.out.println("child thread : " + i);
        }
    }
}

public class YieldExample
{
    public static void main(String[] args)
    {
        MyThread4 t = new MyThread4();
        t.start();

        for(int i=1;i<=10;i++) {
            System.out.println("main thread : " + i);
        }
    }
}