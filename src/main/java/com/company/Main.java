package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List prospects = FileUtils.readFile("prospects.txt");
        List<Prospect> prospectList = new ArrayList<>();

        for (int i = 1; i < prospects.size(); i++) {
            System.out.println(prospects.get(i));
            String[] test = prospects.get(i).toString().split(",");
            /*for (int j = 0; j < test.length; j++) {
                System.out.println(test[j]);
            }*/

            Prospect prospect = new Prospect(test[0],Double.parseDouble(test[1]),Double.parseDouble(test[2]),Integer.parseInt(test[3]));
            prospectList.add(prospect);

        }
        for (int i = 0; i < prospectList.size(); i++) {
            System.out.printf("Prospect %d: %s wants to borrow %.2f for a period of %d years and pay (interest) %.2f € each month\n",
                    i+1,
                    prospectList.get(i).getName(),
                    prospectList.get(i).getLoan(),
                    prospectList.get(i).getYears(),
                    prospectList.get(i).getInterest());

        }

    }
}

