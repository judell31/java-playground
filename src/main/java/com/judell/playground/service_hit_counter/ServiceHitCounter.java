package com.judell.playground.service_hit_counter;

import java.util.HashMap;
import java.util.Map;


public class ServiceHitCounter
{
    private static final ServiceHitCounter INSTANCE = new ServiceHitCounter();

    Map<String,Integer> counters;


    public static ServiceHitCounter instance()
    {
        return INSTANCE;
    }


    private ServiceHitCounter()
    {
        counters = new HashMap<>();
    }


    public synchronized void incrementHitCounterFor(String service)
    {
        var value = counters.get(service);
        if (value == null)
        {
            counters.put(service, 1);
        }
        else
        {
            counters.put(service, value + 1);
        }
    }


    public synchronized int getHitsFor(String service)
    {
        var value = counters.get(service);
        if(value == null)
        {
            return 0;
        }
        return value;
    }
}