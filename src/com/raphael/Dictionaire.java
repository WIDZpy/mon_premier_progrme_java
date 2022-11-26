package com.raphael;

import java.util.HashMap;
import java.util.Map;
import static com.raphael.Main.log;

public class Dictionaire {
    public static void main(String[] args) {
        Map<Integer,Integer> dict = new HashMap<>();
        dict.put(12,12);
        if (dict.get(15)==null){
            dict.put(15,0);
        }
        dict.put(15,dict.get(15)+1);

        log(dict);
    }
}
