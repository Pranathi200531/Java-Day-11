import java.util.*;
interface printable{
    
}
class h implements printable
{
    public void Print()
    {
        System.out.println("Hello Studentd");
    }
}
public class Markerinterface{
    public static void main(String args[]){
        h f=new h();
        f.Print();
    }
}