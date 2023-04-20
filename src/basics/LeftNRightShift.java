package basics;

public class LeftNRightShift {
    public static void main(String[] args) {
        // << left shift operator it takes shifts the binary operators towards left as many times we asked for example
        //int a = 25; // 1 1 0 0 1 if 2 shift to left -> 1 1 0 0 1 0 0 vice versa for right shift.

        int a = 8; // 1 1 0 0 1
        int b = a << 2;

        System.out.println(b);
    }
}
