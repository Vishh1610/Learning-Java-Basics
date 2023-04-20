package numbertrick;

public class SwapN {
    public static void main(String[] args) {
        int a = 5; //1 0 1
        int b = 4; //1 0 0
        //^ -> XOR  1 1-> 0, 1 0 -> 1 (same binary numbers = 0 and different = 1)

        a=a^b;// 1 0 1  XOR 1 0 0 -> 0 0 1
        b=a^b;// 0 0 1 XOR 1 0 0 -> 1 0 1
        a=a^b;// 0 0 1 XOR 1 0 1 -> 1 0 0

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
