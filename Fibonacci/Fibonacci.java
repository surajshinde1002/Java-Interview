package Fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 9;
        int first = 0;
        int second = 1;
        int temp = 0;
        System.out.print(first +" "+ second);
        for (int i = 2; i < n; i++) {
           
            temp  = first + second ;
            System.out.print(" "+temp);

            first = second ;
            second = temp;
        }
    }
}
