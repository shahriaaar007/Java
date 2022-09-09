package BasicJava;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num,temp,rev=0,rem;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        num=input.nextInt();
        temp= num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }

        if(rev==temp){
            System.out.println("\n"+temp+" is Palindrome number");
        }
        else{
            System.out.println("\n"+temp+" is not Palindrome number");
        }
    }
}

