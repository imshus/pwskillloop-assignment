//Q5. Write a Java program to generate and print the first 'n' terms of the Fibonacci series.
import java.util.*;
public class question5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=fib(n);
        System.out.println(m);
    }
    public static int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        int fn1=fib(n-1);
        int fn2=fib(n-2);
        int nth=fn1+fn2;
        return nth;
    }
}
