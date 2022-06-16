import java.util.Scanner;
public class HexOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "3E";
        if(str.matches("[0-9 A-F]+"))
            System.out.println("Hexadecimal Number");
        else
            System.out.println("Not a hexadecimal number.");
    }
}