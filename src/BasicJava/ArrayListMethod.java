package BasicJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(8);
        arr.add(3);
        System.out.print("The arraylist is: "+arr);
        arr.set(0,1);
        System.out.print("\nAfter replacing the arraylist is: "+arr);
        Scanner input=new Scanner(System.in);
        System.out.print("\nEnter the value to check index: ");
        int n=input.nextInt();
        int index=arr.indexOf(n);
        System.out.print("The index of inputed array is: "+index);
        System.out.print("\nEnter the index to get value: ");
        int r=input.nextInt();
        int get=arr.get(r);
        System.out.print("The value of inputed index is: "+get);

    }
}
