package com.jcourse.guess.models;

import java.util.Enumeration;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 03.11.13
 * Time: 12:53
 * To change this template use File | Settings | File Templates.
 */
public class ModelResponse{

    private boolean isWin;
    enum Result {
        WIN,
        FAIL,
        LESS,//...
    }
    private String message;

    public ModelResponse(String message, boolean isWin){
        this.isWin = isWin;
        this.message = message;
    }

    public boolean getResult() {
        return isWin;
    }

    public String getMessage() {
        return message;
    }
}
