package com.company.example3;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author limanovsv
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Добро пожаловать в систему! Введите целое число");

            int command = scanner.nextInt();

            Stream<Integer> inputStream = Stream.of(command);
            inputStream.forEach(integer -> {
                if ((command > 0 && command % 3 == 0 && command % 5 == 0))
                    System.out.println("FooBar");
                else if (command > 0 && command % 5 == 0)
                    System.out.println("Bar");
                else if (command > 0 && command % 3 == 0)
                    System.out.println("Foo");
                else System.out.println(integer);
            });
        }
    }
}
