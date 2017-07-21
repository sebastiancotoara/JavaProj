package com.company;

import java.util.*;

/**
 * Created by sebastiancotoara on 07/17/2017.
 */
public class LogicalOperations {
    public boolean compareToValue(int nomberToCompare, int nr) {
        if (nr < nomberToCompare)
            return true;
        return false;
    }

    public boolean isInInterval(int number, int startInterval, int endInterval) {
        if (number >= startInterval && number <= endInterval) {
            System.out.println(number + " is in interval.");
            return true;
        }
        System.out.println("Number not in interval");
        return false;
    }

    public int returnBiggestNumber(int a, int b) {
        if (compareToValue(a, b))
            return a;
        else
            return b;
    }

    public String returnSnowHeight(int inputNumber) {
        if (inputNumber > 8 || inputNumber == 6)
            return "The amount of snow this winter was(cm): " + inputNumber;
        else
            return "The forecast snow is(cm): " + inputNumber;
    }

    public String relateTo3And4(float inputNumber) {
        if (inputNumber > 3 && inputNumber != 4)
            return "The number is greater than 3 and not equal to 4";
        else if (inputNumber == 4)
            return "The number is equal to 4";
        else if (inputNumber < 3)
            return "The number is lowe than 3";
        return "Number is 3";
    }

    public boolean isEven(int inputNumber) {
        if (inputNumber % 2 == 0) {
            System.out.println("Number is even.");
            return true;
        }
        System.out.println("Number is not even.");
        return false;
    }

    public boolean isNumberInTheArray(int number, int[] givenArray) {
        boolean result = false;

        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] == number)
                result = true;
        }
        return result;
    }

    public int[] removeItemFromArray(int number, int[] givenArray) {
        int[] newArray = new int[givenArray.length - 1];

        for (int i = 0; i < number - 1; i++) {
            newArray[i] = givenArray[i];
        }
        for (int i = number - 1; i < newArray.length; i++) {
            newArray[i] = givenArray[i + 1];
        }
        return newArray;
    }

    public List<String> removeItemFromList(int number, String list) {
        List initialList = readEnteredList(list);

        for (int i = initialList.size()-1; i > 0; i--) {
            if (i == number || i % number == 0) {
                initialList.remove(i);

            }
        }
//        Collections.sort(initialList);

        return initialList;
    }

    public List<String> readEnteredList(String introducedList) {
        List<String> list = new ArrayList(Arrays.asList(introducedList.split(",")));
        return list;
    }

    public int[] readEnteredArray(String introducedArray){
        List<String> list = new ArrayList<>(Arrays.asList(introducedArray.split(",")));
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++){
            for (Object o : list){
                array[i] = Integer.getInteger((String) o);
            }
        }
        return array;
    }
}
