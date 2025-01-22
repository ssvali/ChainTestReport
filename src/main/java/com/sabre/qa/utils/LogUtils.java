package com.sabre.qa.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtils {

    private static final Logger log = LogManager.getLogger(LogUtils.class.getName());

    public static void info(String message) {
        log.info(message);
    }

    public static void debug(String message) {
        log.debug(message);
    }

    public static void error(String message, Throwable t) {
        log.error(message, t);
    }
}
