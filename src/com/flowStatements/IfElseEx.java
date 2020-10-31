package com.flowStatements;

import java.util.Scanner;

public class IfElseEx {
    public static void main(String[] args) {
        System.out.println("Enter marks of a student");
        Scanner s = new Scanner(System.in);
        int marks = s.nextInt();

        if(marks<35){
            System.out.println("fail");
        }else if(marks<=50){
            System.out.println("Pass");
        }else if(marks<60){
            System.out.println("Second class");
        }else if(marks<=70) {
            System.out.println("First class");
        }else {
            System.out.println("Distinction");
            }
        }
    }

