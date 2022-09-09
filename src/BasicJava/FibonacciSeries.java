package BasicJava;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n=input.nextInt();
        int num1=0,num2=1,num3;
        System.out.print("The series is: ");
        for(int i=2;i<=n;i++){
            num3=num1+num2;
            System.out.print(num3+"\t");
            num1=num2;
            num2=num3;
        }


    }
}
