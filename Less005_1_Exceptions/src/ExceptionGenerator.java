/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 16.11.13
 * Time: 16:15
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionGenerator implements IExceptionGenerator {


    @Override
    public void generateNullPointerException() {
        Object o = null;
        o.toString();
    }

    @Override
    public void generateClassCastException() {
        Object o = new Object();
        Integer i = (Integer) o;
    }

    @Override
    public void generateNumberFormatException() {
        Double.parseDouble("dasdsa");
    }

    @Override
    public void generateStackOverflowError() {
        class A{
            A(){
              new A();
            }
        }
        new A();
    }

    @Override
    public void generateOutOfMemoryError() {
        double d[] = new double[Integer.MAX_VALUE];
    }

    @Override
    public void generateMyException(String message) {
        throw new RuntimeException(message);
    }
}
