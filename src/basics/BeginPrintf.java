package basics;

public class BeginPrintf {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        int k = i + j;

        System.out.println("The addition of "+ i + " and "+ j + " is " + k);
        System.out.printf("The addition of %d and %d is %d",i,j,k);
    }
}
