package com.company.excercise;

import java.util.List;

public class Practice2 {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS",
                "Docker", "PCF", "Azure", "Kubernetes");

        printAllCoursesInListFunctional(courses);
    }

    private static void printAllCoursesInListFunctional(List<String> courses) {
        courses.stream()
                .forEach(System.out ::println);

    }
}

