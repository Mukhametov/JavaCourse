package ru.jcourse.less002.instructions;

<<<<<<< HEAD
import ru.jcourse.less002.Instruction;
import ru.jcourse.less002.InstructionFactory;
import ru.jcourse.less002.exceptions.CanNotParseString;
import static ru.jcourse.less002.InstructionFactory.hashMap;
import static ru.jcourse.less002.InstructionFactory.stack;

public class Push implements Instruction{
	
	
	@Override
	public void execute(String string) {
		
//		try {
//			if (hashMap.get(string) != null){
//				stack.push(string);
//			} else {
////				stack.
//			}
//				
//				
//			System.out.println();
//		} catch (RuntimeException e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}
		
//		try {
//			
//			
//			
//			String key = string.substring(0, string.indexOf(" ")).trim();
//			Double value = Double.valueOf(string.substring(string.indexOf(" ")).trim());
//			
//			put(key, value);
//			
//			System.out.println("Associated: " + key + " " + value );
//			
//		} catch (Exception e) {
////			throw new CanNotParseString();
//		}
//		
//		System.out.println(getClass().getSimpleName() + ": " + string);
	}

	
=======
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

>>>>>>> f9f6a1aa8aa44927e34ae6ef281ee64f38595acc
}
