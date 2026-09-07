public class Sum_2dArray {
    public static void main(String[] args) {
        int sum=0;
        int a[][]={{10,20},{30,40}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }
            System.out.println("Sum: "+sum);
        }
    }
}
