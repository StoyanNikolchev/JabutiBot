package com.immedicable.utils;

import java.util.List;
import java.util.Random;

public class QuoteManager {
    private static final List<String> quotes = List.of(
            "sarah and i fuck all the time %n--GronkWizard",
            "omg a black man %n--Seagull2",
            "why are there discord rules if its anarchy smh %n--onion",
            "Don't forget, the facesitting Contest starts next weekend! %n--Weiss",
            "i hope black pete dreams of pretzels %n--Weiss",
            "Friendly reminder that he %n--he");

    private static final Random random = new Random();

    public static String getRandomQuote(){
        int randomIndex = random.nextInt(quotes.size());
        return quotes.get(randomIndex);
    }
}
