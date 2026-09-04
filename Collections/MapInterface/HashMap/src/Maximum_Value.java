import java.util.*;
public class Maximum_Value {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(101,50);
        map.put(102,80);
        map.put(103,60);
        int maxKey=0;
        int maxValue=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if(entry.getValue()>maxValue) {
                maxValue=entry.getValue();
                maxKey=entry.getKey();
            }
        }
        System.out.println("Key = "+maxKey);
        System.out.println("Value = "+maxValue);
    }
}