package com.jcourse.guess.view;

import com.jcourse.guess.controller.GuessController;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 03.11.13
 * Time: 14:42
 * To change this template use File | Settings | File Templates.
 */
public class ConsoleView {
    Scanner scanner = new Scanner(System.in);
    GuessController guessController = new GuessController();

    public ConsoleView() {
        while (true){
            System.out.println(guessController.gameDo(scanner.nextLine()));
        }

    }

}
