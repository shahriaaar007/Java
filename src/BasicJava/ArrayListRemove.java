package BasicJava;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String>str=new ArrayList<>();
        str.add("mango");
        str.add("banana");
        str.add("pineapple");
        System.out.print("The arraylist is: ");
        for(String x:str){
            System.out.print(x+" ");
        }
        System.out.print("\nThe arraylist after removing is: ");
        str.remove(1);
        System.out.print(str);
        System.out.print("\nThe arraylist after removing all: ");
        str.removeAll(str);
        System.out.print(str);
        System.out.print("\nThe arraylist after clearing: ");
        str.clear();
        System.out.print(str);

    }
}
