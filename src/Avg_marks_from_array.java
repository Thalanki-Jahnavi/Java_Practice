public class Avg_marks_from_array {
    public static void main(String[] args) {
        int[] arr={88,76,94,92,90};
        int sum=0;
        for(int i:arr) {
            sum=sum+i;
        }
        int avg=sum/arr.length;
        System.out.println(avg);
    }
}
