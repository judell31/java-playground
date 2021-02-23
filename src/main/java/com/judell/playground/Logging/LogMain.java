package com.judell.playground.Logging;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//Todo: fix slf4j import dep
public class LogMain {
//    private final static Logger logger = LoggerFactory.getLogger(LogMain.class);

    public static void main(String[] args) {
        int x = 3;
//        logger.debug("Debug");
//        logger.info(x(4));
//        logger.error("Error {}", x);
//        logger.atInfo().addArgument(x(3)).log("the number was {}");
    }

    public static String x(int x){
        if(x == 3){
            return "hello";
        }
        return "you need to enter the number 3";
    }
}
