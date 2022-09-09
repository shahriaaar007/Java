package BasicJava;

public class MethodOverloading {
    static int printnum(int x, int y){
        return x+y;
    }
    static double printnum(double x,double y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println("The result of integer number is: "+printnum(5,4));
        System.out.println("The result of double number is: "+printnum(4.5,6.3));

    }

}
