package com.zoo.animal.exception;

public class WrongMeetException extends IllegalArgumentException{
    public WrongMeetException() {
        super();
    }

    public WrongMeetException(String s) {
        super(s);
    }

    public WrongMeetException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongMeetException(Throwable cause) {
        super(cause);
    }
}
