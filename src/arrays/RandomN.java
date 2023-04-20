package arrays;

import java.util.Random;

public class RandomN {
    public static void main(String[] args) {

        Random random = new Random();
        int a[] = new int[20];


        for (int i=0;i<a.length;i++) {
            a[i]= random.nextInt(50);
        }

        for (int i : a){
            System.out.println(i);
        }
    }
}
