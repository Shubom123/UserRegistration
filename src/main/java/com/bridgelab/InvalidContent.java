package com.bridgelab;

public class InvalidContent extends Exception{
    ExceptionType type;

    enum ExceptionType {
        NULL, EMPTY
    }
    public String message;
    public InvalidContent(ExceptionType type,String message){
        super(message);
        this.type=type;
    }
}
