import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(10);
        boolean palindrome=true;
        int i=0;
        int j=list.size()-1;
        while(i<j) {
            if(!list.get(i).equals(list.get(j))) {
                palindrome=false;
                break;
            }
            i++;
            j--;
        }
        if(palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}