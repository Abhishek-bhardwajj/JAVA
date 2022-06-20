package Loops;

import java.util.Scanner;

public class APSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and d");
        int a = sc.nextInt();
        int d = sc.nextInt();
        System.out.print("Enter the number of elements");
        int n = sc.nextInt();
        int term = a;
        for(int i = 0; i<n; i++){
            System.out.print(term+" ");
            term+=d;
        }
    }
}
