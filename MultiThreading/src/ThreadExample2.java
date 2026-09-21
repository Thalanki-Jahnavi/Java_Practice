class Test2 extends  Thread{
    public void run(){
        int[] arr={1,22,22,3,4};
        int[] temp=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];
        for(int i=0;i<=j;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
}
class Test3 extends Thread{
    public void run(){
        int a=10,b=20,c;
        c=b/a;
        System.out.println("Sum: "+c);
    }
}
public class ThreadExample2 {
    public static void main(String[] args) {
        Test2 t2=new Test2();
        Test3 t3=new Test3();
        t2.start();
        t3.start();
    }
}
