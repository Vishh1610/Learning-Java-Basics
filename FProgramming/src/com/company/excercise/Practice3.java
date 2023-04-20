package com.company.excercise;

import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS",
                "Docker", "PCF", "Azure", "Kubernetes");

        printAllSpringCoursesInListFunctional(courses);
    }

    private static void printAllSpringCoursesInListFunctional(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out ::println);

    }
}
