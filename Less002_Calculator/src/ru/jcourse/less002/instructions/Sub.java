package ru.jcourse.less002.instructions;

<<<<<<< HEAD
import ru.jcourse.less002.Instruction;

public class Sub implements Instruction {

	@Override
	public void execute(String string) {
		System.out.println(getClass().getSimpleName() + ": " + string);
=======
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
>>>>>>> f9f6a1aa8aa44927e34ae6ef281ee64f38595acc
	}

}
