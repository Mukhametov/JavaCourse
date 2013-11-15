package ru.jcourse.less002.instructions;

<<<<<<< HEAD
import ru.jcourse.less002.Instruction;
import ru.jcourse.less002.InstructionFactory;
import ru.jcourse.less002.VarDigit;
import ru.jcourse.less002.exceptions.CanNotParseString;

public class Define implements Instruction {

	@Override
	public void execute(String string) throws CanNotParseString {
		try {
			String key = string.substring(0, string.indexOf(" ")).trim();
			Double value = Double.valueOf(string.substring(string.indexOf(" ")).trim());
			
			InstructionFactory.hashMap.put(key, value);
			
			System.out.println("Associated: " + key + " " + value );
			
=======
import java.util.List;

import ru.jcourse.less002.components.VarRegister;
import ru.jcourse.less002.components.obj.Autowired;
import ru.jcourse.less002.components.obj.FieldTarget;
import ru.jcourse.less002.components.obj.Instruction;
import ru.jcourse.less002.exceptions.CanNotParseString;

public class Define implements Instruction {
	
	@Autowired(fieldTarget = FieldTarget.VARS)
	public VarRegister vars;
	
	@Autowired(fieldTarget = FieldTarget.PARAMS)
	public List<String> params;
	
	@Override
	public String execute() throws CanNotParseString {
		try {
			vars.putVar(params.get(0), Double.valueOf(params.get(1)));
>>>>>>> f9f6a1aa8aa44927e34ae6ef281ee64f38595acc
		} catch (Exception e) {
			throw new CanNotParseString();
		}
		
<<<<<<< HEAD
		
	}

=======
		return null;
	}
>>>>>>> f9f6a1aa8aa44927e34ae6ef281ee64f38595acc
}
