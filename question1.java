//Q1. Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.
import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter natural number:-");
        int n=scn.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            sum=sum+i;
        }
        System.out.print(sum);
    }
}
