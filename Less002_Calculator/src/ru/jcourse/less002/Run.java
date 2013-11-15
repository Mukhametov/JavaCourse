package ru.jcourse.less002;

<<<<<<< HEAD
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
	
=======
import java.io.FileInputStream;

import ru.jcourse.less002.components.Calculator;


public class Run {

	public static void main(String[] args) throws Exception {

		Calculator controller = new Calculator(new FileInputStream(
				"D:\\Prog\\stud\\JavaCourse\\Less002_Calculator\\1"),
				System.out);

		controller.doMany();

		
//		Calculator controller = new Calculator(System.in,
//				System.out);
//
//		
//		controller.doOne();
	}
>>>>>>> f9f6a1aa8aa44927e34ae6ef281ee64f38595acc
}
