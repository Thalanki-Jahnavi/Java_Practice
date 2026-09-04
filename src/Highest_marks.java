import java.util.*;
public class Highest_marks {
    public static void main(String[] args) {
        int java,sql,html;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter java, sql, html marks: ");
        java=sc.nextInt();
        sql=sc.nextInt();
        html=sc.nextInt();
        if(java>sql && java>html){
            System.out.println("Java scored highest marks");
        }
        else if(sql>java && sql>html){
            System.out.println("SQL scored highest marks");
        }
        else{
            System.out.println("HTML scored highest marks");
        }
    }
}
