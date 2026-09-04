import java.util.*;
public class Tax1 {
    public static void main(String[] args) {
        double salary,tax;
        System.out.println("Enter Employee Salary: ");
        Scanner sc=new Scanner(System.in);
        salary=sc.nextDouble();
        if(salary>25000){
            tax=salary*0.13;
            System.out.println("Tax Amount: "+tax);
            salary=salary-tax;
            System.out.println("Remaining Salary: "+salary);
        }
        else{
            System.out.println("No Tax");
        }
    }
}
