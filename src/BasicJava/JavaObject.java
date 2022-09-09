package BasicJava;

import java.util.Scanner;

public class JavaObject {

    void show(int x,int y) {
        int sum=x+y;
        System.out.print("The result is: "+sum);
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int a=input.nextInt();
        System.out.print("Enter the second value:");
        int b=input.nextInt();
        JavaObject ob=new JavaObject();
        ob.show(a,b);
    }
}

