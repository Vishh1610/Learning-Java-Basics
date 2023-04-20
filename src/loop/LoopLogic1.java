package loop;

public class LoopLogic1 {
    public static void main(String[] args) {

// Nested For Loops.
        /*
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        to return this pattern -> * * * *
                                  * * * *
                                  * * * *
                                  * * * *
           */

        // In nested loop i represent number of rows where j represent the columns;
        /*
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }*/
        /*to return this pattern -> *
                                    * *
                                    * * *
                                    * * * *
                                  */

         /*
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        to return this pattern -> 1 2 3 4
                                  1 2 3 4
                                  1 2 3 4
                                  1 2 3 4
           */

        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                int k = i + j -1;
                if (k>4){
                    System.out.print(k-4 + " ");
                }else
                    System.out.print(k + " ");
            }
            System.out.println("");
        }
        /*to return this pattern -> 1 2 3 4
                                  2 3 4 1
                                  3 4 1 2
                                  4 1 2 3
*/
    }
}
