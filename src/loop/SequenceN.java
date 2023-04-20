package loop;

/*
1 1 2 3 5 8
*/

import java.util.Scanner;

public class SequenceN {
    public static void main(String[] args) {
        int k, a=1,b=1;
        k=0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(" 1 1  ");
        while (k<=n){

            k=a+b;
            if (k>=n)
                break;
            System.out.print(k + " ");
            a=b;
            b=k;

        }

    }
}
