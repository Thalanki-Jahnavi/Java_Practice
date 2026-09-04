public class Fibonacci_Prime {
    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.println("Prime numbers in Fibonacci series:");
        for(int i=1;i<=20;i++){
            c=a+b;
            int count=0;
            for (int j=1;j<=c;j++) {
                if (c%j==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.print(c+" ");
            }
            a=b;
            b=c;
        }
    }
}
