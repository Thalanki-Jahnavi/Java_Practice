import java.util.*;
public class Tax2 {
    public static void main(String[] args) {
        double ctc,tax;
        System.out.println("Enter Employee CTC:");
        Scanner sc=new Scanner(System.in);
        ctc=sc.nextDouble();
        if(ctc<3){
            tax=0;
        }
        else if(ctc<5){
            tax=ctc*0.05;
        }
        else if(ctc<7){
            tax=ctc*0.1;
        }
        else if(ctc<10){
            tax=ctc*0.15;
        }
        else if(ctc<15){
            tax=ctc*0.2;
        }
        else if(ctc<20){
            tax=ctc*0.25;
        }
        else if(ctc<30){
            tax=ctc*0.3;
        }
        else{
            tax=ctc*0.35;
        }
        System.out.println("Employee Tax: "+tax);
    }
}
