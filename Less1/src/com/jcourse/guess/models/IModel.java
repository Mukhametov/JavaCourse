package com.jcourse.guess.models;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 03.11.13
 * Time: 12:50
 * To change this template use File | Settings | File Templates.
 */
public interface IModel {
    public void clear();
    public ModelResponse tryGuess(String tryMessage) throws Exception;
}
