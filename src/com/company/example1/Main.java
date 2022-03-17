package com.company.example1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Добро пожаловать в систему! Введите целое число");

            int command = scanner.nextInt();

            if (command > 0 && command % 3 == 0 && command % 5 == 0) {
                System.out.println("FooBar");
            } else if (command > 0 && command % 5 == 0) {
                System.out.println("Bar");
            } else if (command > 0 && command % 3 == 0) {
                System.out.println("Foo");
            } else {
                System.out.println(command);
            }
        }
    }
}
