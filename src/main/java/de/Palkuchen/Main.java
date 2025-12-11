package de.Palkuchen;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String input = "in ulm und um ulm herrum";
        HashMap<Character, Integer> result = getCountOfChars(input);


    }

    public static HashMap<Character, Integer> getCountOfChars(String input) {
        HashMap<Character, Integer> result = new HashMap<>();

        for (char c1 : input.toCharArray()) {
            if (result.containsKey(c1)) continue;
            int count = 0;
            for (char c2 : input.toCharArray()) {
                if (c2 == c1) count++;
            }
            result.put(c1, count);
        }

        return result;
    }
}