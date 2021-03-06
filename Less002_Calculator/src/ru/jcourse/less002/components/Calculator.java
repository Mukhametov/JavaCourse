package ru.jcourse.less002.components;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import ru.jcourse.less002.components.obj.Instruction;
import ru.jcourse.less002.util.Parser;

public class Calculator {
	private VarRegister vars = new VarRegister();
	private Stack<Double> stack = new Stack<>();
	private List<Instruction> instructions = new ArrayList<>();
	private PrintWriter printWriter;
	private Scanner scanner;
	private InstructionFactory instructionFactory = new InstructionFactory();

	public Calculator(InputStream inputStream, OutputStream outputStream) {
		scanner = new Scanner(inputStream);
		printWriter = new PrintWriter(outputStream);
	}

	private void readCommand() {
		String[] params = Parser.parseCommand(scanner.nextLine());
		if (params == null)
			return;

		Instruction instruction = instructionFactory.getInstruction(params,
				vars, stack);

		if (instruction != null)
			instructions.add(instruction);
	}

	private void executeCommand(Instruction i) {
		Object o = i.execute();

		if (o != null) {
			printWriter.println(o);
			printWriter.flush();
		}
	}

	public void doMany() {
		instructions = new ArrayList<>();
		while (scanner.hasNext()) {
			readCommand();
		}

		for (Instruction i : instructions) {
			executeCommand(i);
		}
	}

	public void doOne() {
		while (scanner.hasNext()) {
			
			instructions = new ArrayList<>();
			readCommand();
			if (!instructions.isEmpty())
			executeCommand(instructions.get(0));
		}
	}
}
