package ru.jcourse.less002;

public class Run {

	public static void main(String[] args) {
//		Реализовать
//			Add
//		+	Define
//			Div
//			Mul
//			Pop
//			Print
//			Push
//			Sharp
//			Sqrt
//			Sub
		
		try {
			InstructionFactory.getInstruction("define").execute("a 12");
			InstructionFactory.getInstruction("define").execute("b 45");
			InstructionFactory.getInstruction("define").execute("a 66.3");
			InstructionFactory.getInstruction("define").execute("c 97");
			
//			InstructionFactory.getInstruction("Push").execute("c97");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (String s: InstructionFactory.hashMap.keySet()){
			System.out.println(s + ": " + InstructionFactory.hashMap.get(s));
		}
		
	}
	
}
