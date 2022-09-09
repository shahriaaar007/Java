package BasicJava;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        String str;
        String str2="";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string");
        str=input.nextLine();
        String temp=str;
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            str2=str2+str.charAt(i);
        }
        if(temp.equals(str2)){
            System.out.print("\n"+str+" is palindrome");
        }
        else{
            System.out.println("\n"+str+" is not palindrome");
        }
    }
}
