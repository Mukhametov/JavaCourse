package ru.jcourse.jdbc.factory.commands;

import ru.jcourse.jdbc.factory.Command;

import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 19.11.13
 * Time: 23:39
 * To change this template use File | Settings | File Templates.
 */
public class UnknownCommand implements Command {
    @Override
    public String execute(String... strings) {
        return "Unknown command. Try again.";
    }
}
