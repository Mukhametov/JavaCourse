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
    private int wordCount = 0;
    private RepetitionStorage result = null;

    public Parser(String fileName) throws FileNotFoundException, UnsupportedEncodingException {
        this.fileName = fileName;
    }

    public int getWordCount() {
        return wordCount;
    }

    private void addWord(StringBuilder sb){
        if (sb.toString().length() == 0)
            return;
        result.add(sb.toString());
        wordCount++;
    }

    public Map<String, Integer> getMap() throws IOException {
        Reader reader = null;
        try {
            reader = new InputStreamReader(new BufferedInputStream(new FileInputStream(fileName)), "UTF-8");
            result = new RepetitionStorage();
            StringBuilder stringBuilder = new StringBuilder();

            int data = reader.read();
            while (data != -1) {
                if (Character.isLetterOrDigit(data))
                    stringBuilder.append((char) data);
                else {
                    addWord(stringBuilder);
                    stringBuilder = new StringBuilder();
                }
                data = reader.read();
            }

            addWord(stringBuilder);
        } finally {
            if (reader != null)
                reader.close();
        }

        return result;
    }
}
