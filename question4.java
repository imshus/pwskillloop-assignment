
//Q4. Write a Java program to check if a given string is a palindrome or not using a loop.
import java.util.*;
public class question4 {
    public static boolean pali(String n) {
        for(int i=0;i<n.length()/2;i++){
            for(int j=n.length()-1;j>=i;j--){
                if(n.charAt(i)==n.charAt(j)){
                    i++;
                    j--;
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String sc=scn.nextLine();
        boolean m=pali(sc);
        System.out.print(m);
    }
}
