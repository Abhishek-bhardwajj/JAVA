package Loops;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n, rem, rev=0;
        while(n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        if(rev == m)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");
    }
}
