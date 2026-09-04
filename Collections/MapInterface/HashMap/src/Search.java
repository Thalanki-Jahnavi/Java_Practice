import java.util.*;
public class Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, String> map=new HashMap<>();
        map.put(101, "Teja");
        map.put(102, "Janu");
        map.put(103, "Chandu");
        System.out.print("Enter ID to search: ");
        int id=sc.nextInt();
        if(map.containsKey(id)) {
            System.out.println("Name = "+map.get(id));
        } else {
            System.out.println("ID not found");
        }
    }
}