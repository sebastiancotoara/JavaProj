package com.company;

/**
 * Created by sebastiancotoara on 07/17/2017.
 */
public class TextMessages {
    public String compareText(String input) {
        if (input.equals("Evozon"))
            return "Learning text comparison.";
        else
            return "Gotta try some more.";
    }

    public String compareText(String inputString, int inputInt) {
        if (inputString.equals("Evozon") && inputInt <= 3)
            return "Evozon " + inputInt;
        else if (!inputString.equals("Evozon") && inputInt >= 4)
            return inputInt + " " + inputString;
        else
            return "Whatever";
    }

    public String verifyAge(int inputAge) {
        if (inputAge >= 18)
            return "You are eligible to vote";
        return "You are not eligible to vote";
    }


    public String verifyGrade(int score) {
        if (score >= 90)
            return "A";
        else if (score >= 70 && score <= 90)
            return "B";
        else if (score >= 50 && score <= 70)
            return "C";
        else
            return "F";
    }

    public boolean verifyIntegerAnswer(String choice) {
        if (choice.equals("b")) {
            System.out.println("You chose the correct answer!");
            return true;
        }
        System.out.println("Answer is not correct!");
        return false;
    }

    public void printStarsDesc(int initialNumber) {
        for (int i = initialNumber; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    public void printNumbersAndStars(int finalNumber) {
        for (int i = 1; i <= finalNumber; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int j = finalNumber; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
