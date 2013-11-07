package ru.jcourse.less002.instructions;

import ru.jcourse.less002.Instruction;
import ru.jcourse.less002.InstructionFactory;
import ru.jcourse.less002.exceptions.CanNotParseString;

public class Define implements Instruction {

	@Override
	public void execute(String string) throws CanNotParseString {
		try {
			String key = string.substring(0, string.indexOf(" ")).trim();
			Double value = Double.valueOf(string.substring(string.indexOf(" ")).trim());
			
			InstructionFactory.hashMap.put(key, value);
			
			System.out.println("Associated: " + key + " " + value );
			
		} catch (Exception e) {
			throw new CanNotParseString();
		}
		
		
	}

}
