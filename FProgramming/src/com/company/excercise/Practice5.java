package com.company.excercise;

import java.util.List;

public class Practice5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,12,15);

        printCubesOfOddNumberInListFunctional(numbers);
    }

    private static void printCubesOfOddNumberInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * n * n)
                .forEach(System.out :: println);
    }
}
