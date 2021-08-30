package com.company;

public class ImpossibleNameException extends Throwable {
    public ImpossibleNameException(String message) {
    }

    public ImpossibleNameException(Throwable cause) {
        super(cause);
    }

    public ImpossibleNameException(String message, Throwable cause) {
        super(message, cause);
    }


}
