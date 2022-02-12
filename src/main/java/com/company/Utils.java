package com.company;

import java.util.ArrayList;

public class Utils {

    public static ArrayList<Prospect> readProspects() {
        ArrayList<Prospect> prospectList = new ArrayList<>();
        ArrayList<String> prospects = FileUtils.readFile("prospects.txt");

        for (int i = 1; i < prospects.size(); i++) {
            String[] prospectString = prospects.get(i).split(",");
            Prospect prospect = new Prospect(prospectString[0], Double.parseDouble(prospectString[1]),
                    Double.parseDouble(prospectString[2]), Integer.parseInt(prospectString[3]));
            prospectList.add(prospect);
        }

        return prospectList;
    }

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

    public static String generateResultsString(ArrayList<Prospect> prospects) {
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < prospects.size(); i++) {
            results.append(String.format("\nProspect %d: %s wants to borrow %.2f € for a period of %d years and pay %.2f € each month.",
                    i+1,
                    prospects.get(i).getName(),
                    prospects.get(i).getLoan(),
                    prospects.get(i).getYears(),
                    prospects.get(i).getMonthlyPayment()));
        }

        return results.toString();
    }
}
