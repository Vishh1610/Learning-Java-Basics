package basics;

public class PostNPre {
    public static void main(String[] args) {
        int i = 5;

        int j = i++;
        //when we assign i++ it will assign the value first it is post increment.
        //when we assign ++i it will increase the value first it is pre increment. #++i

        System.out.println(j +" and "+ i);

    }
}
