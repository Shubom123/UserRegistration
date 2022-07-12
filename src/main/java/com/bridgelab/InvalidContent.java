package com.bridgelab;

public class InvalidContent extends Exception{
    public String message;
    public InvalidContent(String message){
        super(message);
    }
}
