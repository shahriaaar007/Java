package BasicJava;

import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        int min;
        int max;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the minimum number: ");
        min=input.nextInt();
        System.out.print("Enter the maximum number: ");
        max=input.nextInt();

        System.out.print("\nDouble type random value between "+min+" to "+max+": ");
        double random=Math.random()*(max-min+1)+min;
        System.out.println(random);

        System.out.print("Integer type random value between "+min+" to "+max+": ");
        int randomint=(int)(Math.random()*(max-min+1)+min);
        System.out.println(randomint);
    }
}

