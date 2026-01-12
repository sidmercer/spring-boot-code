package com.siddhant.basics;

public class GreetResponse {

    private String message;
    private int status;

    public GreetResponse(String message,int status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }
}
