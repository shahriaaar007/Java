package BasicJava;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input the String: ");
        String s=input.nextLine();
        int len=s.length();
        System.out.print("\nThe length of the string is: "+len);
    }
}
