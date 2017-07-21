package com.company;

/**
 * Created by sebastiancotoara on 07/17/2017.
 */
public class TempConverter {

    public float fahrenheitToCelsius(float a) {
        return (5 * (a - 32)) / 9;
    }

    public float celsiusToFahrenheit(float a) {
        return (float) (a * 1.8 + 32);
    }
}
