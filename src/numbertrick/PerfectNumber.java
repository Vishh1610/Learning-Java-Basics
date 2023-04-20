package numbertrick;
// factors and their sum is equal to the given number.
public class PerfectNumber {
    public static void main(String[] args) {
        int n = 28;
        boolean b = isPerfect(n);
        if (b)
            System.out.println("It's perfect number");
        else
            System.out.println("It's not perfect number");
    }

    private static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i<n;i++){
            if (n%i==0){
                sum = sum + i;

            }
        }

        if (n==sum){
            return true;
        }

        return false;
    }
}
