package BasicJava;

import java.util.ArrayList;

public class ArrayListAddAll {
    public static void main(String[] args) {
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();
        ArrayList<Integer>arr3=new ArrayList<>();

        arr1.add(4);
        arr1.add(7);
        arr1.add(3);
        arr1.add(9);

        arr2.add(3);
        arr2.add(4);
        arr2.add(8);
        arr2.add(5);
        System.out.println("The list of arraylist1 is: "+arr1);
        System.out.println("The list of arraylist2 is: "+arr2);

        arr3.addAll(arr1);
        System.out.print("The list of arraylist3 is: "+arr3);
        boolean check=arr1.equals(arr2);
        System.out.print("\nArraylist1 and Arraylist2 is equal? "+check);
        check=arr1.equals(arr3);
        System.out.print("\nArraylist1 and Arraylist3 is equal? "+check);

    }
}
