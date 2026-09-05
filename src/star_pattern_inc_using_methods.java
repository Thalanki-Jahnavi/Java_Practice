public class star_pattern_inc_using_methods {
    static void star_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        star_pattern(4);
    }
}
