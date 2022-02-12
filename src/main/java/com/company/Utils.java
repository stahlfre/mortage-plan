package com.company;

public class Utils {

    public static double pow(double b, int p) {
        if (p == 1) {
            return 1;
        } else {
            double result = b;
            for (int i = 1; i < p; i++) {
                result = b * result;
            }
            return result;
        }
    }

    public static double roundToHundreds(double E) {

        return ((int)(E * 100 + 0.5)) / 100.0;
    }

    public static double calculatePayment(double loan, double interest, int years) {
        double E;
        double b = interest / 12 / 100;
        int p = years * 12;

        E = loan * (b * pow(1+b,p)) / (pow(1+b,p) - 1);

        return roundToHundreds(E);
    }

}
