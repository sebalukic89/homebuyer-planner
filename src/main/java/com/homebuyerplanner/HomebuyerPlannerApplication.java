package com.homebuyerplanner;

import com.homebuyerplanner.model.BuyerProfile;

import java.math.BigDecimal;

public class HomebuyerPlannerApplication {

    public static void main(String[] args) {
        BuyerProfile firstBuyer = new BuyerProfile(
                "Sebastian",
                BigDecimal.valueOf(90_000),
                BigDecimal.valueOf(1_200),
                BigDecimal.valueOf(80_000));
        BuyerProfile secondBuyer = new BuyerProfile("Alex",
                BigDecimal.valueOf(75_000),
                BigDecimal.valueOf(600),
                BigDecimal.valueOf(45_000));

        System.out.println("First buyer: " + firstBuyer.getFullName());
        System.out.println("Second buyer: " + secondBuyer.getFullName());
    }
}
