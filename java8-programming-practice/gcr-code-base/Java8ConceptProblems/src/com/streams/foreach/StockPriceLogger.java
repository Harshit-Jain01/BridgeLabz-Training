package com.streams.foreach;

import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {

    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(
                1023.50,
                1018.75,
                1030.20,
                1025.10,
                1042.90
        );

        System.out.println("Live Stock Price Updates:");

      stockPrices.stream().forEach(System.out::println);
    }
}
