package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static List<String> readFile(String fileName) {

        List<String> listOfStrings = new ArrayList<String>();

        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.replaceAll("[^\\p{L}0-9]", "").equals("")) {
                    if (!line.isEmpty() && line.charAt(0) == '\"') {
                        String snip = line.substring(0,line.lastIndexOf('\"')).replaceAll("[^\\p{L}]", " ").strip()
                                + line.substring(line.lastIndexOf('\"')+1);
                        listOfStrings.add(snip);
                    } else {
                        listOfStrings.add(line);
                    }
                }


            }

            bufferedReader.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listOfStrings;
    }
}
