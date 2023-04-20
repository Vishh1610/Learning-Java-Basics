package loop;

public class AsciValue {
    /*all ascii values are of 7 bits
    2^7
    0-127 -> range
    ascii -> american standard code for information interchange; every key has its own ascii value.*/

    public static void main(String[] args) {

        for (int i = 0;i<=127;i++){
            System.out.printf("%d : %c  \n",i,i);
        }

    }
}
