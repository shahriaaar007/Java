package BasicJava;

import java.util.Scanner;

public class FibonacciRecursion {

    static int fibonacci(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }


    public static void main(String[] args) {
        FibonacciRecursion ob=new FibonacciRecursion();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x=input.nextInt();
        System.out.println("The number is: "+ob.fibonacci(x));
    }
}
