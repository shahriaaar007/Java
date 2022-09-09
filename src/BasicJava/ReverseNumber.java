package BasicJava;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        int number,reverse=0,remainder;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        number=input.nextInt();
        while(number!=0){
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("The reverse number is: "+reverse);
    }
}
