package ru.jcourse.less002;

import static ru.jcourse.less002.InstructionFactory.hashMap;

public class VarDigit {
	
	String name;
	double value;
	
	public VarDigit(String name, double value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public double getValue(){
//		if (name != null)
//			return hashMap.get(name).getValue();
//		else 
			return value;
	}
	
	@Override
	public String toString() {
		Double d = getValue();
		return  "" + d;
	}
}
