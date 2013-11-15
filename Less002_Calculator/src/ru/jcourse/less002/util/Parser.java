package ru.jcourse.less002.util;

public class Parser {

	public static String[] parseCommand(String line) {
		if (line.equals("")) {
			return null;
		}
		return line.split(" ");
	}
}
