//Q2. Write a Java program to print a multiplication table for a given number 'n'.
import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("table of :-");
        int n=scn.nextInt();
        int count=1;
        for(int i=n;i<=n*10;i=i+n){
            System.out.println(count+"*"+n+"="+i);
            count++;
        }
    }
}
