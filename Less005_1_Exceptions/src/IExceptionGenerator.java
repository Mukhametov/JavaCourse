/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 16.11.13
 * Time: 16:14
 * To change this template use File | Settings | File Templates.
 */
public interface IExceptionGenerator {
    void generateNullPointerException();
    void generateClassCastException();
    void generateNumberFormatException();
    void generateStackOverflowError();
    void generateOutOfMemoryError();
    void generateMyException(String message) throws MyException;
}
