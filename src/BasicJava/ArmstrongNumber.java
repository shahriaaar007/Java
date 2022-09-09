package BasicJava;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num,rem,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        num=input.nextInt();
        int temp=num;


        while(temp!=0){
            rem=temp%10;
            sum=sum+rem*rem*rem;
            temp=temp/10;
        }
        System.out.println("\nThe output result is: "+sum);
        if(num==sum){
            System.out.println(num+" is Armstrong number");
        }
        else{
            System.out.println(num+" is not Armstrong number");
        }

    }
}
