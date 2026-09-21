class Test6 extends Thread {
    public void task1() {
        System.out.println("Task 1: Addition");
        System.out.println(10 + 20);
    }

    public void task2() {
        System.out.println("Task 2: Multiplication");
        System.out.println(10 * 20);
    }

    public void task3() {
        System.out.println("Task 3: Division");
        System.out.println(20 / 10);
    }
}

public class ThreadExample4 {
    public static void main(String[] args) {
        Test6 t6 = new Test6();
        t6.task1();
        t6.task2();
        t6.task3();
    }
}