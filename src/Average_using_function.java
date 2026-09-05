public class Average_using_function {
    static double average(int...numbers) {
        int sum = 0;
        for(int num:numbers) {
            sum += num;
        }
        return (double) sum/numbers.length;
    }

    public static void main(String[] args) {
        System.out.println(average(90,67,58,94,65));
    }
}
