package com.streams.gymmembership;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MembershipFilter {

    public static void main(String[] args) {

        List<GymMember> members = new ArrayList<>();

        members.add(new GymMember("Amit", LocalDate.now().plusDays(10)));
        members.add(new GymMember("Ravi", LocalDate.now().plusDays(40)));
        members.add(new GymMember("Neha", LocalDate.now().plusDays(25)));
        members.add(new GymMember("Pooja", LocalDate.now().plusDays(5)));
        members.add(new GymMember("Rahul", LocalDate.now().plusDays(60)));

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        members.stream()
               .filter(m -> !m.getExpiryDate().isBefore(today)
                         && m.getExpiryDate().isBefore(next30Days))
               .forEach(System.out::println);
    }
}
