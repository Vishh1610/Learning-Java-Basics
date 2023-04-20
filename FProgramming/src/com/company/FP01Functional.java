package com.company;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,12,15);

        // printAllNumberInListFunctional(numbers);
        printEvenNumberInListFunctional(numbers);
    }

   // private static void print(int number){
    //    System.out.println(number);
   // }

       // private static boolean isEven(int number){
        //return number%2==0;
        //}

    private static void printAllNumberInListFunctional(List<Integer> numbers) {

      /*  for(int number:numbers){
            System.out.println(number);

         numbers.stream()
                .forEach(FP01Functional::print);*/

        numbers.stream()
                .forEach(System.out::println);
    }

    private static void printEvenNumberInListFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
}
