public class Calculate_Array_Sum {
    public static void main(String[] args){
        double[] arr={2.5,8.2,7.4,9.0,6.6};
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
