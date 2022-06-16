import java.util.Scanner;
public class Date {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a date :");
        String str = sc.nextLine();
        if(str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"))
            System.out.println("Valid date in format(dd/mm/yyyy)");
        else
            System.out.println("Invalid.");
    }
}