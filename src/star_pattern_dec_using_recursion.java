public class star_pattern_dec_using_recursion {
    static void stars(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        stars(n-1);
    }

    public static void main (String[] args){
        stars(4);
    }
}