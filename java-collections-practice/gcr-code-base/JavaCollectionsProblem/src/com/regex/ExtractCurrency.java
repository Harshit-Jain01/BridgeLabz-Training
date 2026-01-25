package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = kb.nextLine();

        String regex = "\\$?\\d+\\.\\d+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }

        kb.close();
    }
}
