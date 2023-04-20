package basics;

public class TernaryOper {
    public static void main(String[] args) {


        int a = 5;
        int b = 3;

//        if (a == 5){
//            b=7;
//        }else {
//            b=3;
//        }
        b = a==5?7:3; //writing form of ternary operator for if else conditions.

        System.out.println(b);


        Object obj1;
        Object obj2;

        obj2 = true?new Integer(10): new Double(15.0);
        System.out.println(obj2);
//      So ternary operators give one benefit it return the higher type of assigned class.
    }
}
