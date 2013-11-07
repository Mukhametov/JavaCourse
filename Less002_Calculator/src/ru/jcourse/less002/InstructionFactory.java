package ru.jcourse.less002;

import java.util.HashMap;
import java.util.Stack;

public class InstructionFactory {

	public static Stack<String> stack = new Stack<>();
	public static HashMap<String, Double> hashMap = new HashMap<>();

	public static Instruction getInstruction(String instruction)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {

		return (Instruction) Class.forName(
				"ru.jcourse.less002.instructions."
						+ instruction.substring(0, 1).toUpperCase()
						+ instruction.substring(1).toLowerCase()

		).newInstance();

	}
}
