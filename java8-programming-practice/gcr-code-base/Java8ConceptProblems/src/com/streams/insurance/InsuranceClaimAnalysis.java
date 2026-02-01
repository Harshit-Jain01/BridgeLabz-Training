package com.streams.insurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {

    public static void main(String[] args) {

        List<InsuranceClaim> claims = new ArrayList<>();
        
        //added insurance to list
        claims.add(new InsuranceClaim("Health", 50000));
        claims.add(new InsuranceClaim("Health", 30000));
        claims.add(new InsuranceClaim("Vehicle", 20000));
        claims.add(new InsuranceClaim("Vehicle", 40000));
        claims.add(new InsuranceClaim("Life", 100000));
        claims.add(new InsuranceClaim("Life", 150000));

        Map<String, Double> averageClaimAmount =
                claims.stream()
                      .collect(Collectors.groupingBy(
                              InsuranceClaim::getClaimType,
                              Collectors.averagingDouble(InsuranceClaim::getAmount)
                      ));

        averageClaimAmount.forEach((type, avg) ->
                System.out.println(type + " → Average Claim Amount: " + avg));
    }
}
