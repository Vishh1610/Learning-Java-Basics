package numbertrick;
/*
Armstrong number is 153 -> 1 5 3 -> 1^3 + 5^3 + 3^3 = 153
*/
public class ArmstrongN {
    public static void main(String[] args) {

        int n = 153;
        int temp = n;
        int r,sum;
        sum=0;

        while (n>0) {
            r = n % 10;
            sum = sum + r * r * r;// first input 153 -> 3*3*3 + 2nd input -> (n/10 =15) r-> 5*5*5 -> (15/10=1) r-> 1^3
            n = n / 10;

        }

        if (temp==sum){
            System.out.println("it's an armstrong number");
        }else {
            System.out.println("it's not an armstrong number");
        }

    }
}
