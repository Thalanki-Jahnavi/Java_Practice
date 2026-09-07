public class Exception4 {
    public static void main(String[] args) {
        try{
            int a=10/0;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            //e.printStachTrace();
            //System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
