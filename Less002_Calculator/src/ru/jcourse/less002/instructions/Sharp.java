package ru.jcourse.less002.instructions;

<<<<<<< HEAD
import ru.jcourse.less002.Instruction;

public class Sharp implements Instruction{
	
	
	@Override
	public void execute(String string) {
		System.out.println(getClass().getSimpleName() + ": " + string);
	}

	
=======
import java.util.List;

import ru.jcourse.less002.components.obj.Autowired;
import ru.jcourse.less002.components.obj.FieldTarget;
import ru.jcourse.less002.components.obj.Instruction;

public class Sharp implements Instruction {

	@Autowired(fieldTarget = FieldTarget.PARAMS)
	public List<String> params;

	@Override
	public String execute() {
		String result = "#";
		for (int i = 0; i < params.size(); i++)
			result += params.get(i);
		return result;
	}

>>>>>>> f9f6a1aa8aa44927e34ae6ef281ee64f38595acc
}
