//Q3. Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.
import java.util.*;
public class question3 {
    public static int calcGCD(int n, int m){

        while(n%m!=0){
            int rem=n%m;
            n=m;
            m=rem;
        }
        return m;
        // Write your code here.
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter first number:-");
        int n=scn.nextInt();
        System.out.print("Enter second number:-");
        int x=scn.nextInt();
        int m=calcGCD(n, x);
        System.out.print(m);
    }
}
