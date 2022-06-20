package Loops;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        int count=0;
        while(n>0){
            rem = n%10;
            n/=10;
            count++;
        }
        System.out.println("No. of digits in a number is:"+count);
    }
}
