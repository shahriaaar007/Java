package BasicJava;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input the 1st string: ");
        String s1=input.nextLine();
        System.out.print("Input the 2nd string: ");
        String s2=input.nextLine();
        if(s1.equalsIgnoreCase(s2)){
            System.out.print("\nThe string are same");
        }
        else {
            System.out.print("\nThe string are not same");
        }

    }
}
