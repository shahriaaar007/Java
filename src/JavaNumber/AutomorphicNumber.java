package JavaNumber;

import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=input.nextInt();
        int temp=num;
        int square=temp*temp;
        int len=0;
        while(temp>0){
            len++;
            temp=temp/10;
        }
        int lastdigit=(int)(square%(Math.pow(10,len)));
        if(lastdigit==num){
            System.out.println(num+" is Automorphic number");
        }
        else{
            System.out.println(num+" is not Automorphic number");
        }
    }
}
