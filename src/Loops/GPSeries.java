package Loops;

import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and r");
        int a = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int term = a;
        for(int i=0; i<n; i++){
            System.out.print(term+",");
            term*=r;
        }
    }
}
