package BasicJava;

import java.util.Scanner;

public class StringContains {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input the 1st string: ");
        String s1=input.nextLine();
        System.out.print("Input the 2nd string: ");
        String s2=input.nextLine();
        boolean check=s1.contains(s2);
        System.out.print("The first string has this? "+check);
    }
}
