package com.company;

public class Prospect {

    private String name;
    private double loan;
    private double interest;
    private int years;

    public Prospect (String name, double loan, double interest, int years) {
        setName(name);
        setLoan(loan);
        setInterest(interest);
        setYears(years);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getLoan() {
        return loan;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }
}
