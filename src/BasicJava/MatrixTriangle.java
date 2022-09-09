package BasicJava;

import java.util.Scanner;

public class MatrixTriangle {

    public static void main(String[] args) {

        int a[][]=new int[4][];
        int k=0;
        a[0]=new int[1];
        a[1]=new int[2];
        a[2]=new int[3];
        a[3]=new int[4];

        for(int i=0;i<4;i++){
            for(int j=0;j<i+1;j++){
                a[i][j]=k;
                k++;
            }
        }
        System.out.println("The output matrix is");
        for(int i=0;i<4;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}
