import java.util.Scanner;
public class Email01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any email id to be checked:");
        String e = sc.nextLine();

        if(e.endsWith("gmail.com")){
            System.out.println("Yes, it is a Gmail id.");
        }
        else
            System.out.println("Not a gmail id");
    }
}