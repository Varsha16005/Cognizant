package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.error("This is an ERROR log message");
        logger.warn("This is a WARN log message");
        logger.info("This is an INFO log message");
        logger.debug("This is a DEBUG log message");
    }
}
