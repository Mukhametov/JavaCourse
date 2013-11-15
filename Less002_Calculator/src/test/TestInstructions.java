package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ru.jcourse.less002.components.InstructionFactory;
import ru.jcourse.less002.components.VarRegister;
import ru.jcourse.less002.components.obj.Instruction;
import ru.jcourse.less002.instructions.Add;

public class TestInstructions {
	private Stack<Double> stack;
	private InstructionFactory instructionFactory;
//	private Properties properties;
	private Instruction instruction;
	private VarRegister varRegister;

	@Before
	public void init() {
		stack = new Stack<Double>();
		instructionFactory = new InstructionFactory();
		varRegister = new VarRegister();
	}

	@Test
	public void testAdd() {
		stack.push(3.0);
		stack.push(5.0);
		
		String[] params = {"+"};
		instruction = instructionFactory.getInstruction(params, varRegister,
				stack);
		instruction.execute();
		Assert.assertEquals("Add operation failed", Double.valueOf(stack.pop()).compareTo(8.0), 0);
	}
	
	@Test
	public void testSub() {
		stack.push(9.0);
		stack.push(5.0);
		
		String[] params = {"-"};
		instruction = instructionFactory.getInstruction(params, varRegister,
				stack);
		instruction.execute();
		Assert.assertEquals("Sub operation failed", Double.valueOf(stack.pop()).compareTo(4.0), 0);
	}
	
	@Test
	public void testMul() {
		stack.push(9.0);
		stack.push(5.0);
		
		String[] params = {"*"};
		instruction = instructionFactory.getInstruction(params, varRegister,
				stack);
		instruction.execute();
		Assert.assertEquals("Mul operation failed", Double.valueOf(stack.pop()).compareTo(45.0), 0);
	}
	
	@Test
	public void testDiv() {
		stack.push(40.0);
		stack.push(5.0);
		
		String[] params = {"/"};
		instruction = instructionFactory.getInstruction(params, varRegister,
				stack);
		instruction.execute();
		Assert.assertEquals("Div operation failed", Double.valueOf(stack.pop()).compareTo(8.0), 0);
	}
	
	@Test
	public void testDefine() {
		String[] params = {"DEFINE",  "a",  "30"};
		instruction = instructionFactory.getInstruction(params, varRegister,
				stack);
		instruction.execute();
		Assert.assertEquals("Define operation failed", Double.valueOf(
				varRegister.getValue("a")).compareTo(30.0), 0);
	}
	
	@Test
	public void testPop() {
		stack = new Stack<>();
		stack.push(40.0);
		String[] params = {"POP"};
		instruction = instructionFactory.getInstruction(params, varRegister,
				stack);
		instruction.execute();
		Assert.assertEquals("Pop operation failed", stack.size(), 0);
	}
	
	@Test
	public void testPrint() {
		stack.push(40.0);
		String[] params = {"PRINT"};
		instruction = instructionFactory.getInstruction(params, varRegister,
				stack);
		Assert.assertEquals("Print operation failed", instruction.execute(), "40.0");
	}
	
	@Test
	public void testPush() {
		stack = new Stack<>();
		String[] params = {"PUSH", "1"};
		instruction = instructionFactory.getInstruction(params, varRegister,
				stack);
		instruction.execute();
		Assert.assertEquals("Push operation failed", stack.size(), 1);
	}
	
	@Test
	public void testSharp() {
		stack = new Stack<>();
		String[] params = {"#", "qwerty"};
		instruction = instructionFactory.getInstruction(params, varRegister,
				stack);
		Assert.assertEquals("Sharp operation failed", instruction.execute(), "#qwerty");
	}
	
	@Test
	public void testSqrt() {
		stack = new Stack<>();
		stack.push(16.0);
		stack.push(4.0);
		
		String[] params = {"SQRT", "qwerty"};
		instruction = instructionFactory.getInstruction(params, varRegister,
				stack);
		Assert.assertEquals("Sqrt operation failed", 
				Double.valueOf(stack.pop()).compareTo(4.0), 0);
	}
	
	
	
}