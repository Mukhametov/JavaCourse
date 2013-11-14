package ru.javacourse.less4;

import java.io.*;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 14.11.13
 * Time: 23:36
 * To change this template use File | Settings | File Templates.
 */
public class Parser {
    private String fileName;

    public Parser(String fileName) throws FileNotFoundException, UnsupportedEncodingException {
        this.fileName = fileName;
    }

    public Map<String, Integer> getMap() throws IOException {
        Reader reader = null;
        RepetitionStorage result = null;

        try {
            reader = new InputStreamReader(new BufferedInputStream(new FileInputStream(fileName)), "UTF-8");
            result = new RepetitionStorage();
            StringBuilder stringBuilder = new StringBuilder();

            int data = reader.read();
            while(data != -1){
                if (Character.isLetterOrDigit(data))
                    stringBuilder.append((char) data);
                else {
                    result.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                }
                data = reader.read();
            }
        } finally {
            if (reader != null)
                reader.close();
        }
        return result;
    }
}
