public class star_pattern_inc_using_recursion {
    static void stars(int n) {
        if (n == 0) {
            return;
        }
        stars(n - 1);
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main (String[] args){
        stars(4);
    }
}