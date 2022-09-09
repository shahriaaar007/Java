package BasicJava;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        int m,n;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Initial value: ");
        m=input.nextInt();
        System.out.print("Enter the Final value: ");
        n=input.nextInt();
        for(int i=m;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" X "+j+" = "+i*j);

            }
            System.out.println();
        }
    }
}

