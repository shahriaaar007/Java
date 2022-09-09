package BasicJava;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        String str;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the string: ");
        str=input.nextLine();
        String temp=str;
        StringBuffer ob=new StringBuffer(str);
        String rev=ob.reverse().toString();
        System.out.println("The reverse String is: "+rev);

    }
}
