package BasicJava;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        arr.add(5);
        arr.add(6);
        arr.add(2);
        arr.add(6);

        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.print("\nSize of the array is : "+arr.size());
    }
}
