package loop;

public class BreakStatement {
    public static void main(String[] args) {

        /*for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        outcome -> 1234
                   1234
                   1234
                   1234
        */

        // unlabelled break statement;
        /*for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                if (i==3)
                    break; //this breaks the inner loop at i == 3;
                System.out.print(j);
            }
            System.out.println("");
        }*/
        // labelled break statement

        vish:
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                if (i==3)
                    break vish; //this breaks the outer loop at i == 3;
                System.out.print(j);
            }
            System.out.println("");
        }

    }
}
