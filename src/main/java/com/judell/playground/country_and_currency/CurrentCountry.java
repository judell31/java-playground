package com.judell.playground.country_and_currency;

import java.util.Locale;

public class CurrentCountry {

    /**
     * Gets your current country
     */
    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        System.out.println(currentLocale.getDisplayCountry());
    }
}
