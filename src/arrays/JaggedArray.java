package arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int x[] = {5,6,7,8};
        int y[] = {6,7};
        int z[] = {9,8,7};

        int p[][] = {{5,6,7,8},{6,7},{9,8,7}};

        /*for (int i =0;i<3;i++){
            for (int j =0;j<4;j++){
                System.out.print(p[i][j] + "  ");
            }
            System.out.println(" ");
        }*/

/*
        it will work but if we create new array, and we have to assign new values with different array elements we need
        to do it in such way ->
        int k [][] = new int[3][];
        k[0]= new int[4];
        k[1]= new int[3];
        k[2]= new int[2];*/


        for (int i[] : p){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

    }
}
