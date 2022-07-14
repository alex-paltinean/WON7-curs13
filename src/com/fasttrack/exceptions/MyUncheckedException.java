package com.fasttrack.exceptions;

public class MyUncheckedException extends RuntimeException {
    private long timeOfFailure;

    public MyUncheckedException(String message) {
        super(message);
        timeOfFailure = System.currentTimeMillis();
    }

    public long getTimeOfFailure() {
        return timeOfFailure;
    }
}
