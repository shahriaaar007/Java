package BasicJava;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the total row number: ");
        int row=input.nextInt();
        System.out.print("Enter the total column number: ");
        int col=input.nextInt();
        int a[][]=new int[row][col];
        int sumofdia=0;
        System.out.println("Enter the element of the array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("a[%d][%d]= ",i,j);
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("\nThe matrix is: ");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf(" "+a[i][j]);
            }
            System.out.println();
        }

        System.out.println();


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    sumofdia=sumofdia+a[i][j];
                }
            }

        }
        System.out.println("The diagonal sum is: "+sumofdia);


    }
}
