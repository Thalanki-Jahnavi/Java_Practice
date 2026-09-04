import java.util.*;
class  Student{
    void grade(){
        int s1,s2,s3,total,avg;
        System.out.println("Enter 3 subject marks: ");
        Scanner sc=new Scanner(System.in);
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        total=s1+s2+s3;
        avg=total/3;
        if(avg>=90){
            System.out.println("A grade");
        }
        else if(avg>=70) {
            System.out.println("B grade");
        }
        else if(avg>=50) {
            System.out.println("C grade");
        }
        else {
            System.out.println("Fail");
        }
    }
}
class VowelOrConsonant extends Student{
    void vowel(){
        char ch;
        System.out.println("Enter a character: ");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        switch(ch){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}
public class Single_Inheritance1 {
    public static void main(String[] args) {
        int min,max,i,j,count;
        System.out.println("Enter min,max values: ");
        Scanner sc=new Scanner(System.in);
        min=sc.nextInt();
        max=sc.nextInt();
        System.out.println("Prime Numbers are: ");
        for(i=min;i<=max;i++){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        VowelOrConsonant v=new VowelOrConsonant();
        v.grade();
        v.vowel();
    }
}
