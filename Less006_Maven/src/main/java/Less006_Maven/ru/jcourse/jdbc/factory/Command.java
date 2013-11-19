package Less006_Maven.ru.jcourse.jdbc.factory;

import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 19.11.13
 * Time: 20:55
 * To change this template use File | Settings | File Templates.
 */
public interface Command {
    public void execute(PrintStream out, String... strings);
}
