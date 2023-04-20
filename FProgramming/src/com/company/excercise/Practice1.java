package com.company.excercise;

import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,12,15);

        printOddNumberInListFunctional(numbers);
    }

    private static void printOddNumberInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out :: println);
    }
}
