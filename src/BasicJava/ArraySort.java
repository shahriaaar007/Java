package BasicJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of the array:");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("The arrays in Ascending order are: ");
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.print("\nThe arrays in Descending order are: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+"\t");
        }
    }
}
