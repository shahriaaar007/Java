package BasicJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        arr.add(4);
        arr.add(6);
        arr.add(3);
        arr.add(9);
        Iterator itr=arr.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
    }

}
