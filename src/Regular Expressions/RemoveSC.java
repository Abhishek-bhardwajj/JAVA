import java.util.Scanner;

public class RemoveSC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.replaceAll("[^A-Za-z1-9]", ""));
    }
}