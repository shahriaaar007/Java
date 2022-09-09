package BasicJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(-5);
        arr.add(9);
        arr.add(-2);
        System.out.print("The Arraylist is: "+arr);
        Collections.sort(arr);
        System.out.print("\nAfter the sorting in ascending order, the arraylist is: "+arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("\nAfter the sorting in descending order, the arraylist is: "+arr);
    }
}
