import java.util.*;
class Arraylist{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(345);
        a.add(909);
        a.add(767);
        //addinig at particular index
        a.add(1,765);
        //modifying
        a.set(2,876);
        System.out.println(a);
    }
}