package basics;

public class SwitchCase {
    public static void main(String[] args) {
        int i = 7;

        switch (i) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Not defined");
                break;
        }
    }
}
