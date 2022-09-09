package BasicJava;

import java.util.Scanner;

public class FactorialRecursion {

    static int fact(int n){
        if(n==1) {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }


    public static void main(String[] args) {
        FactorialRecursion ob= new FactorialRecursion();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the input: ");
        int x=input.nextInt();
        int result=ob.fact(x);
        System.out.println("The result is: "+result);

    }
}
