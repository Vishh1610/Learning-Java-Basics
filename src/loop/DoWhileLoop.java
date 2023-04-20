package loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
//      do while loop always returns value;it returns the value first then checks the condition.
        do {
            System.out.println(i);
            i++;
        }while (i<10);
    }
}
