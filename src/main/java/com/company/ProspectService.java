package com.company;

import java.util.ArrayList;

public class ProspectService {

    public ProspectService() {
        ArrayList<Prospect> prospects = Utils.readProspects();
        System.out.println(Utils.generateResultsString(prospects));
    }
}
