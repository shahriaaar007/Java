package JavaNumber;

import java.util.Scanner;

public class AutomorphicRange {

    private static boolean  auto(int num){
        int len=0;
        int temp=num;
        int square=temp*temp;
        while(temp>0){
            len++;
            temp=temp/10;
        }
        int lastdigit=(int)(square%(Math.pow(10,len)));
        return num==lastdigit;
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the start value: ");
        int start=input.nextInt();
        System.out.print("Enter the end value: ");
        int end=input.nextInt();
        System.out.print("The automorphic number between "+start+" and "+end+" are: ");
        for(int i=start;i<=end;i++){
            if(auto(i)){
                System.out.print(i+"\t");
            }
        }
    }
}
