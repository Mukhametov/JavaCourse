package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;
//import static ru.jcourse.less002.InstructionFactory;


import ru.jcourse.less002.components.Calculator;

public class TestCalculator2 {

	public Double stackCalc(double a, double b, double c) {
		String s = "DEFINE a " + a + "\nDEFINE b " + b + "\nDEFINE c " + c
				+ "\nPUSH b\nPUSH b\n*\nPUSH 4\nPUSH a\nPUSH c\n*"
				+ "\n*\n-\nSQRT\nPUSH -1\n*\nPUSH b\n-\nPUSH 2"
				+ "\nPUSH a\n*\n/\nPRINT";

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Calculator calculator = new Calculator(new ByteArrayInputStream(s.getBytes()), out);
		calculator.doMany();
		
		try (Scanner scaner = new Scanner(new ByteArrayInputStream(
				out.toByteArray()))) {
			return Double.valueOf(scaner.nextLine());
		} catch (Exception e) {
		}

		return null;

	}

	public double checkCalc(double a, double b, double c) {
		return (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	}

	public String getMessage(double a, double b, double c) {
		return "Error in TestCalculator1 with params: a=" + a + "; b=" + b
				+ "; c=" + c;
	}

	@Test
	public void test1() {
		double a = 1;
		double b = 1;
		double c = 1;

		Assert.assertTrue(getMessage(a, b, c),
				stackCalc(a, b, c).compareTo(checkCalc(a, b, c)) == 0);
	}
}
