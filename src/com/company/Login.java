package com.company;

import java.util.Scanner;

/**
 * Created by sebastiancotoara on 07/19/2017.
 */
public class Login {
    private String userName;
    private String password;
    ReadInput readInput = new ReadInput();

    public boolean login(String userName, String password) {

        if (userName.equals(Constants.USERNAME) && password.equals(Constants.PASSWORD))
            return true;
        return false;
    }

    public boolean loginValidation() {
        for (int i = 0; i < Constants.MAX_NUMBER_OF_TRIES; i++) {
            System.out.println("Introduceti numele utilizatorului!");
            String userName = readInput.readSring();
            System.out.println("Introduceti parola!");
            String password = readInput.readSring();

            if (login(userName, password)) {
                System.out.println("Buna, " + Constants.USERNAME + "! Esti logat!");
                return true;
            } else {
                if (Constants.MAX_NUMBER_OF_TRIES - i - 1 == 1)
                    System.out.println("Numele utilizatorului sau parola sunt gresite.\n" +
                            "Mai ai " + (Constants.MAX_NUMBER_OF_TRIES - i - 1) + " incercare");
                System.out.println("Numele utilizatorului sau parola sunt gresite.\n" +
                        "Mai ai " + (Constants.MAX_NUMBER_OF_TRIES - i - 1) + " incercari");
            }
        }
        return false;
    }
}
