import java.util.Scanner;
public class Swapping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of two no. a and b simultaneously:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("Value of a after swapping:"+a);
        System.out.println("Value of b after swapping:"+b);
    }
}