package ru.jcourse.less002.instructions;

import ru.jcourse.less002.Instruction;

public class Add implements Instruction{
	
	
	@Override
	public void execute(String string) {
		System.out.println(getClass().getSimpleName() + ": " + string);
	}

	
}
