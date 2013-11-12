package ru.jcourse.less002;

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
}
