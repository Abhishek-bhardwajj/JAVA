import java.util.Scanner;
public class Binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        if(str.matches("[01]+"))
            System.out.println("Yes it is a binary number");
        else
            System.out.println("Not a binary number.");
    }
}