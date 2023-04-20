package basics;

public class BitwiseOp {
    public static void main(String[] args) {
        int a = 25; // 1 1 0 0 1
        int b = 15; // 0 1 1 1 1

        //bitwise operator -> and & or |
        // values for & is  if both values are same then return same for example 1 1 -> 1 while for
        // or its vice versa.
        int c = a & b; // 0 1 0 0 1 -> 9 binary values.

        System.out.println(c);
    }
}
