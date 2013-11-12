package ru.jcourse.less002.instructions;

import java.util.List;
import java.util.Stack;

import ru.jcourse.less002.components.VarRegister;
import ru.jcourse.less002.components.obj.Autowired;
import ru.jcourse.less002.components.obj.FieldTarget;
import ru.jcourse.less002.components.obj.Instruction;
import ru.jcourse.less002.exceptions.CanNotParseString;

public class Push implements Instruction {
	@Autowired(fieldTarget = FieldTarget.VARS)
	public VarRegister vars;

	@Autowired(fieldTarget = FieldTarget.STACK)
	public Stack<Double> stack;
	
	@Autowired(fieldTarget = FieldTarget.PARAMS)
	public List<String> params;

	@Override
	public String execute() throws CanNotParseString {

		stack.push(vars.getValue(params.get(0)));
		return null;

	}

}
