package com.homebuyerplanner.model;

import java.math.BigDecimal;

public class BuyerProfile {

    private final String fullName;
    private final BigDecimal annualIncome;
    private final BigDecimal monthlyDebtPayments;
    private final BigDecimal availableSavings;

    public BuyerProfile(
            String fullName,
            BigDecimal annualIncome,
            BigDecimal monthlyDebtPayments,
            BigDecimal availableSavings) {
        this.fullName = fullName;
        this.annualIncome = annualIncome;
        this.monthlyDebtPayments = monthlyDebtPayments;
        this.availableSavings = availableSavings;
    }

    public String getFullName() {
        return fullName;
    }

    public BigDecimal getAnnualIncome() {
        return annualIncome;
    }

    public BigDecimal getMonthlyDebtPayments() {
        return monthlyDebtPayments;
    }

    public BigDecimal getAvailableSavings() {
        return availableSavings;
    }
}
