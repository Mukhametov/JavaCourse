package ru.jcourse.less002.instructions;

import java.util.Stack;

import ru.jcourse.less002.components.obj.Autowired;
import ru.jcourse.less002.components.obj.FieldTarget;
import ru.jcourse.less002.components.obj.Instruction;

public class Sub implements Instruction {
	@Autowired(fieldTarget = FieldTarget.STACK)
	public Stack<Double> stack;

	@Override
	public String execute() {
		Double d = stack.pop();
		stack.push(stack.pop() - d);

		return null;
	}

}
