import java.util.Scanner;
public class BinOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be checked:");
        int n = sc.nextInt();
        String s = String.valueOf(n);
        if(s.matches("[01]+"))
            System.out.println("Yes it is a Binary number.");
        else
            System.out.println("Not a binary number");
    }
}