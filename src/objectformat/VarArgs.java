package objectformat;

//when we don't know how many parameter values we need we use array in it, and it represents with "...".

public class VarArgs {
    public static void main(String[] args) {
        Display d = new Display();
        d.show(5,6,7);
    }
}

class Display{
    public void show(int ... a){
        for (int i : a){
            System.out.println(i);
        }
    }
}

