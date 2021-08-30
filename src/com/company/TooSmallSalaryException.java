package com.company;

public class TooSmallSalaryException extends Exception{


    public TooSmallSalaryException(String message) {
    super(message);
    }

    public TooSmallSalaryException(Throwable cause) {
        super(cause);
    }

    public TooSmallSalaryException(String message, Throwable cause) {
        super(message, cause);
    }

}
