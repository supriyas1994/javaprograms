package Jan2025;

public class ternaryOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int result = ( a>=b && a>=c ) ? a : ( b>=c && b>=a ) ? b : c ;
        System.out.println("Greater number is \n" +result);
        int result1 = ( a<=b && a<=c )? a : ( b<=c ) ? b :c ;
        System.out.println("Smaller number is number is \n"+result1);
    }
}
