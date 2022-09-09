package BasicJava;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int num;
        int flag=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        num=input.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag++;
                System.out.println(num+" is not Prime number");
                break;

            }

        }
        if(flag==0){
            System.out.println(num+" is Prime number");
        }
    }
}

