import java.util.Scanner;

public class celcius_to_farenheit {
    static double convert(double celcius){
        return (celcius*9/5)+32;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in celcius: ");
        double celcius=sc.nextDouble();
        double farenheit=convert(celcius);
        System.out.println("Temperature in Farenheit: "+farenheit);
    }
}
