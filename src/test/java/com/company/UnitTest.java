package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UnitTest {

    @Test
    public void calculationTest() {
        Prospect prospect = new Prospect("Karvinen",4356.00,1.27,6);
        double calculation = Utils.calculatePayment(prospect.getLoan(),prospect.getInterest(), prospect.getYears());
        Assertions.assertEquals(62.87, calculation);
    }
}
