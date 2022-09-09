package BasicJava;

import java.util.Scanner;

public class ArrayOutput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the row size: ");
        int row=input.nextInt();
        System.out.print("Enter the column size: ");
        int col=input.nextInt();
        int arr[][]=new int[row][col];
        int k=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=k;
                k++;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }

}
