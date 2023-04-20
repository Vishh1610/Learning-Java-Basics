package numbertrick;

public class SwapN2 {
    public static void main(String[] args) {
        int a = 5; //1 0 1
        int b = 4; //1 0 0

        b= a+b - (a=b);

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
