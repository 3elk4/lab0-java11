package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        var tailList = new ArrayList<String>(value.length());
        String temp = value;
        for(int i = 0; i < value.length(); ++i){
            tailList.add(temp);
            temp = temp.substring(0, temp.length() - 1);
        }
        tailList.add("");
        return tailList;
    }

}
