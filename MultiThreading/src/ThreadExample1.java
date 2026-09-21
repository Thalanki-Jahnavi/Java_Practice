class Test1 extends  Thread{
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
    }
}
public class ThreadExample1 {
    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.start();
    }
}
