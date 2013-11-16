/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 16.11.13
 * Time: 16:16
 * To change this template use File | Settings | File Templates.
 */
public class Run {

    public static void main(String[] args) throws MyException {

        IExceptionGenerator ieg = new ExceptionGenerator();

        try {
            ieg.generateNullPointerException();
        }   catch (RuntimeException e){
            System.out.println("generateNullPointerException");
            e.printStackTrace();
        }
        try {
            ieg.generateClassCastException();
        }   catch (RuntimeException e){
            System.out.println("generateClassCastException");
            e.printStackTrace();
        }
        try {
            ieg.generateNumberFormatException();
        }   catch (RuntimeException e){
            System.out.println("generateNumberFormatException");
            e.printStackTrace();
        }
        try {
            ieg.generateStackOverflowError();
        }   catch (RuntimeException e){
            System.out.println("generateStackOverflowError");
            e.printStackTrace();
        }
        try {
            ieg.generateOutOfMemoryError();
        }   catch (RuntimeException e){
            System.out.println("generateOutOfMemoryError");
            e.printStackTrace();
        }
        try {
            ieg.generateMyException("This is my exception");
        }   catch (RuntimeException e){
            System.out.println("generateMyException");
            e.printStackTrace();
        }


    }

}
