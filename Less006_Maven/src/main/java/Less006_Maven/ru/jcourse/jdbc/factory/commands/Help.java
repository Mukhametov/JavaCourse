package Less006_Maven.ru.jcourse.jdbc.factory.commands;

import Less006_Maven.ru.jcourse.jdbc.factory.Command;

import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 20.11.13
 * Time: 0:26
 * To change this template use File | Settings | File Templates.
 */
public class Help implements Command {
    @Override
    public void execute(PrintStream out, String... strings) {
        out.println("=====================================================");
        out.println("For add record: Add postDate postMessage");
        out.println("For view records: List");
        out.println("For help: Help");
        out.println("For exit: Exit");
        out.println("=====================================================");


    }
}
