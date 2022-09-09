package BasicJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCheck {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(6);
        arr.add(2);
        System.out.println("When arraylist has all the element");
        boolean check=arr.isEmpty();
        System.out.println("Is arraylist empty? "+check);
        System.out.print("\nEnter the number to check: ");
        int n=input.nextInt();
        boolean contain=arr.contains(n);
        System.out.println("The inputed number is containing? "+contain);
        System.out.println("\nAfter removing all element");
        arr.clear();
        boolean check2=arr.isEmpty();
        System.out.println("Is arraylist empty? "+check2);
    }

}