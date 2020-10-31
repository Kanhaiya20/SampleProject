package com.flowStatements;

import java.util.Scanner;

public class SwitchClasssEx {
    public static void main(String[] args) {
        System.out.println("Enter marks of a student");
        Scanner s = new Scanner(System.in);
        int marks = s.nextInt();

        switch (marks) {
            case 0:
                System.out.println("Entered value is zero");
                break;

            case 1:
                System.out.println("Entered value is one");
                break;

            case 2:
                System.out.println("Entered value is two");
                break;

            default:
                System.out.println("Entered value is greater than two");

        }
    }
}
