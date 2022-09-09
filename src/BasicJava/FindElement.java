package BasicJava;

import java.util.Scanner;

public class FindElement {

    public static void main(String[] args) {
        int n,f;
        boolean flag=false;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Size of the array: ");
        n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element of the array:");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.print("Enter the number to find: ");
        f=input.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==f){
                flag=true;
                break;
            }
        }
        if(flag=false){
            System.out.println("\nThe element is not found");
        }
        else{
            System.out.println("\nThe element is found");
        }
    }
}
