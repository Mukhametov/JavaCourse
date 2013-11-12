package com.jcourse.guess.controller;

import com.jcourse.guess.models.GreateSmallModel;
import com.jcourse.guess.models.IModel;
import com.jcourse.guess.models.ModelResponse;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 03.11.13
 * Time: 14:31
 * To change this template use File | Settings | File Templates.
 */
public class GuessController {

    private IModel model = new GreateSmallModel();

    public String gameDo(String tryMessage){
        ModelResponse modelResponse = null;

        try {
            modelResponse = model.tryGuess(tryMessage);
        }   catch (Exception e){
            return e.getMessage();
        }

        return modelResponse.getMessage();
    }

}
