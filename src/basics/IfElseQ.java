package basics;

public class IfElseQ {
    public static void main(String[] args) {

//     # Odd or Even
        int n1 = 5;

        if (n1 % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

        int a,b,c;
        a=4;
        b=13;
        c=8;

        // in && operator anyone of it is false it returns false while in || operator anyone of its true returns true.
        if(a>b && a>c){
            System.out.println("A");
        } else if (b > c) {
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }


    }
}
