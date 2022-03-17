package com.company.example2;

import java.util.Scanner;

/**
 * @author limanovsv
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Добро пожаловать в систему! Введите целое число");

            int command = scanner.nextInt();

            String s = ((command > 0 && command % 3 == 0 && command % 5 == 0) ? "FooBar"
                    : (((command > 0 && command % 5 == 0)) ? "Bar"
                    : (((command > 0 && command % 3 == 0)) ? "Foo"
                    : String.valueOf(command))));
            System.out.println(s);
        }
    }
}
