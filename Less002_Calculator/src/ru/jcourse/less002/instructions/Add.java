package ru.jcourse.less002.instructions;

<<<<<<< HEAD
import ru.jcourse.less002.Instruction;

public class Add implements Instruction{
	
	
	@Override
	public void execute(String string) {
		System.out.println(getClass().getSimpleName() + ": " + string);
	}

	
=======
import java.util.Stack;

import ru.jcourse.less002.components.obj.Autowired;
import ru.jcourse.less002.components.obj.FieldTarget;
import ru.jcourse.less002.components.obj.Instruction;

public class Add implements Instruction{
	
	@Autowired(fieldTarget = FieldTarget.STACK)
	public Stack<Double> stack;
	
	@Override
	public String execute() {	
		stack.push(stack.pop() + stack.pop());
		return null;
		
	}
>>>>>>> f9f6a1aa8aa44927e34ae6ef281ee64f38595acc
}
