package com.judell.lab;

import java.util.HashMap;
import java.util.Map;

/***
 * Experimenting with returning a list of values from a hash map
 * and printing them out as a list. This is solved in a private repository
 */
public class Main {
    private final static String PREFIX = "!";
    private static HashMap<String, String> triggers = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(triggerKeyList());
    }

    private static HashMap triggerMap(){
        triggers.put("nero", PREFIX + "n");
        triggers.put("son", PREFIX + "s");
        triggers.put("smh", PREFIX + "nsmh");
        return triggers;
    }

    public static Map triggerKeys(){
        return triggerMap();
    }

    public static String triggerKeyList(){
        for (Object name : triggerMap().values()){
            return name.toString();
        }
        return triggerKeys().toString();
    }
}
