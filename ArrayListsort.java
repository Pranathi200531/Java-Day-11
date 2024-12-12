import java.util.*;
public class ArrayListsort{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(45);
        a.add(12);
        a.add(654);
        a.add(4);
        Collections.sort(a);
        System.out.println(a);
    }
}