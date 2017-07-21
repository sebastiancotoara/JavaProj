package com.company;

import java.util.List;
import java.util.SortedMap;

/**
 * Created by sebastiancotoara on 07/18/2017.
 */
public class Menu {
    private static final int TEMPERATURE_MENU = 1;
    private static final int GREATEST_OF_TWO_NUMBERS = 2;
    private static final int CHECK_IF_EVOZON = 3;
    private static final int CHECK_IF_BETWEEN_2_AND_8 = 4;
    private static final int CHECK_IF_EVOZON_AND_NUMBER = 5;
    private static final int CHECK_IF_6_OR_HIGHER_THAN_8 = 6;
    private static final int CHECK_IF_HIGHER_THAN_3_AND_NOT_4 = 7;
    private static final int ENTER_KEYS_0_TO_9 = 8;
    private static final int IS_EVEN_NUMBER = 9;
    private static final int AGE_VERIFICATION = 10;
    private static final int GRADES = 11;
    private static final int JAVA_QUESTION = 12;
    private static final int IS_ELEMENT_IN_ARRAY = 13;
    private static final int PRINT_STARS = 14;
    private static final int PRINT_NUMBERS_AND_STARS = 15;
    private static final int REMOVE_FROM_LIST = 16;
    private static final int EXIT = 0;

    ReadInput readInput = new ReadInput();

    public void printOptions() {
        System.out.println("###################################### MENU ################################################ \n" +
                "1. Convert temperature from F to C\n" +
                "2. Print the greatest number\n" +
                "3. Given a text input, if it is \'Evozon\', then print \'Learning text comparison\'. If not, print \'Gotta try some more\'\n" +
                "4. Given a number, if it\'+s equal to or higher than 2 and equal to or lower than 8, print the number\n" +
                "5. Given a text input and a number input, if the text is equal to \'Evozon\' AND the number is equal to or lower\n" +
                "than 3, print the text and the number. If the text is not \'Evozon\' AND the number is equal to or higher than 4, print\n" +
                "the number and the text, in this order\n" +
                "6. Given a number input, if it is higher than 8 OR equal to 6, print \'The amount of snow this winter was(cm):\'\n" +
                "and the given number. Else print \'The forecast snow is(cm):\'\n" +
                "7. Given a number input, if the number is greater than 3 but not equal to 4, print \'The number is greater than\n" +
                "3 and not equal to 4\'. Else if the number is equal to 4 print \'The number is equal to 4\'. Else if the number is lower\n" +
                "than 3 print \'The number is lower than 3\'\n" +
                "8. If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed,  otherwise,\n" +
                "program will show \'Not allowed\'\n" +
                "9. Write a Java program to determine whether an input number is an even number\n" +
                "10. Write Java program to allow the user to input his/her age. Then the program will show if the person is\n" +
                "eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old\n" +
                "11. Write a Java program that determines a student\'s grade.\n" +
                "The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade\n" +
                "12. Write a Java program that allows the user to choose the correct answer of a question\n" +
                "13. Write a Java program to search for an element of an integer array of 10 elements\n" +
                "14. Write a Java program by using two for loops to produce the output shown in \'Exercices in Java.txt\'\n" +
                "15. Write a Java program by using three for loops to print the patter shown in \'Exercices in Java.txt\'\n" +
                "16. Write a function that takes an input list and an interval n and returns a new list with all the elements of\n" +
                "the original list, in order, except that every nth item has been removed\n\n" +
                "###################################### END MENU ###########################################");
    }

    public boolean chooseOption(int option) {
        TempConverter converter = new TempConverter();
        LogicalOperations logicalOperations = new LogicalOperations();
        TextMessages textMessages = new TextMessages();

        switch (option) {
            case TEMPERATURE_MENU:
                System.out.println("Enter temperature in F degrees!");
                float enteredTemp = readInput.readFloat();
                System.out.print(enteredTemp + " F degrees are: ");
                System.out.printf("%.2f", converter.fahrenheitToCelsius(enteredTemp));
                System.out.println(" Celsius degrees");
                System.out.println();
                break;
            case GREATEST_OF_TWO_NUMBERS:
                System.out.println("Enter two numbers!");
                int nr1 = readInput.readNumber();
                int nr2 = readInput.readNumber();
                System.out.println("The greatest number of the two is: " + logicalOperations.returnBiggestNumber(nr1, nr2));
                break;
            case CHECK_IF_EVOZON:
                System.out.println("Enter a text!");
                System.out.println(textMessages.compareText(readInput.readSring()));
                break;
            case CHECK_IF_BETWEEN_2_AND_8:
                System.out.println("Enter a number!");
                int number = readInput.readNumber();
                System.out.println("Enter an interval!");
                int start = readInput.readNumber();
                int end = readInput.readNumber();
                System.out.println(logicalOperations.isInInterval(number, start, end));
                break;
            case CHECK_IF_EVOZON_AND_NUMBER:
                System.out.println("Enter a text!");
                String text = readInput.readSring();
                System.out.println("Enter a number!");
                int num = readInput.readNumber();
                System.out.println(textMessages.compareText(text, num));
                break;
            case CHECK_IF_6_OR_HIGHER_THAN_8:
                System.out.println("Enter a number!");
                System.out.println(logicalOperations.returnSnowHeight(readInput.readNumber()));
                break;
            case CHECK_IF_HIGHER_THAN_3_AND_NOT_4:
                System.out.println("Enter a number!");
                System.out.println(logicalOperations.relateTo3And4(readInput.readNumber()));
                break;
            case ENTER_KEYS_0_TO_9:
                System.out.println("Enter a number!");
                break;
            case IS_EVEN_NUMBER:
                System.out.println("Enter a number!");
                System.out.println(logicalOperations.isEven(readInput.readNumber()));
                break;
            case AGE_VERIFICATION:
                System.out.println("Enter your age!");
                System.out.println(textMessages.verifyAge(readInput.readNumber()));
                break;
            case GRADES:
                System.out.println("Enter you score (0-100)");
                System.out.println("Your grade is: " + textMessages.verifyGrade(readInput.readNumber()));
                break;
            case JAVA_QUESTION:
                System.out.println("What is the correct way to declare a variable to store an integer value in Java?\n" +
                        "a. int 1x=10;\n" +
                        "b. int x=10;\n" +
                        "c. float x=10.0f;\n" +
                        "d. string x=\"10\";\n" +
                        "Enter your answer!");
                System.out.println(textMessages.verifyIntegerAnswer(readInput.readSring()));
                break;
            case IS_ELEMENT_IN_ARRAY:
                break;
            case PRINT_STARS:
                System.out.println("Enter a number!");
                textMessages.printStarsDesc(readInput.readNumber());
                break;
            case PRINT_NUMBERS_AND_STARS:
                System.out.println("Enter a number!");
                textMessages.printNumbersAndStars(readInput.readNumber());
                break;
            case REMOVE_FROM_LIST:
                System.out.println("Enter a list of numbers! Like in the exemple: 1,3,5,6,9");
                String list = readInput.readSring();
                System.out.println(list);
                System.out.println("Enter a number to be removed from the list!");
                int nr = readInput.readNumber();
                System.out.println(logicalOperations.removeItemFromList(nr, list));
                break;
            case EXIT:
                return false;
            default:
                System.out.println("Alege o optiune valida!");
        }
        return true;
    }

    public void runProgram() {
        Login login = new Login();
//        login.loginValidation();
        int option;
        do {
            printOptions();
            option = readInput.readNumber();
        } while (chooseOption(option));
    }
}
