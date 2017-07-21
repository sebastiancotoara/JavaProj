package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by sebastiancotoara on 07/17/2017.
 */
public class ReadInput {
    public int readNumber() {
        boolean repeat = true;

        int inputValue = 0;

        while (repeat) {
            Scanner scanner = new Scanner(System.in);
            try {
                inputValue = scanner.nextInt();
                repeat = false;
            } catch (InputMismatchException ie) {
                System.out.println("Invalid input. Please enter a number!");
                repeat = true;
            }
        }
        return inputValue;
    }

    public String readSring() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public float readFloat() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}
