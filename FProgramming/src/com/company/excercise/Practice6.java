package com.company.excercise;

import java.util.List;

public class Practice6 {public static void main(String[] args) {
    List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS",
            "Docker", "PCF", "Azure", "Kubernetes");

    printNumberOfCharacterInEachCourse(courses);
}

    private static void printNumberOfCharacterInEachCourse(List<String> courses) {
        courses.stream()
                .map(c -> c + " - " + c.length())
                //.mapToInt(String :: length)
                .forEach(System.out ::println);

    }
}
