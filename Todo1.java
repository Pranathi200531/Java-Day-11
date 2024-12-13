import java.util.*;
public class Todo1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int mouse=150;
        int monitor=20000;
        int Keyword=200;
        int CPU=10000;
        int Speaker=700;
        int Mobile=25000;
        int Earphone=2000;
        int Laptop=50000;
        int total=mouse+monitor+Keyword;
        System.out.println("Total" +total);
        int removing=total-Keyword;
        System.out.println("After removing keyword" +removing);
    }
}