package JavaNumber;

import java.util.Scanner;

public class PetersonNumber {

    static boolean peter(int num){
        int sum=0;
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            sum=sum+fact(digit);
            temp=temp/10;
        }
        return (num==sum);

    }

    static int fact(int temp){
        if(temp==0||temp==1){
            return 1;
        }
        else{
            return temp*fact(temp-1);
        }
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int i=input.nextInt();
        if(peter(i)){
            System.out.print("\n"+i+" is a peterson number");
        }
        else {
            System.out.print("\n"+i+" is not a peterson number");
        }
    }
}