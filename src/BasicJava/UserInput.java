package BasicJava;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        int number;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the input: ");
        number=input.nextInt();
        System.out.print("\nThe output is: "+number);
    }
}

