public class TwoInOne {
    public static void main(String[] args){
        byte a = 9, b = 12;
        byte c;
        c = (byte)(a<<4);   // Storing 'a' in leftmost 4 bits of 'c'
        c = (byte)(c|b);    //Storing 'b' in rightmost 4 bits of 'c'

        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));
    }
}
