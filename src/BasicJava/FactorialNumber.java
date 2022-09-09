package BasicJava;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        int num,fact=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the input number: ");
        num=input.nextInt();
        for(int i=num;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial is: "+fact);
    }
}