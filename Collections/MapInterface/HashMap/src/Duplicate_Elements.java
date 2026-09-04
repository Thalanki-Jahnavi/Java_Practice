import java.util.*;
public class Duplicate_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, Integer> map=new HashMap<>();
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            int num=sc.nextInt();
            if(map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }
        System.out.println("Duplicate elements:");
        for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
            if(entry.getValue()>1) {
                System.out.println(entry.getKey());
            }
        }
    }
}