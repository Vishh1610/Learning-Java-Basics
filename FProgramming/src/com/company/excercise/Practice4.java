package com.company.excercise;

import java.util.List;

public class Practice4 {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS",
                "Docker", "PCF", "Azure", "Kubernetes");

        printAllSpringCoursesInListFunctional(courses);
    }

    private static void printAllSpringCoursesInListFunctional(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out ::println);

    }
}
