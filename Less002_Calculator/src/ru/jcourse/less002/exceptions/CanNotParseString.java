package ru.jcourse.less002.exceptions;

<<<<<<< HEAD
public class CanNotParseString  extends Exception{
=======
public class CanNotParseString  extends RuntimeException{
>>>>>>> f9f6a1aa8aa44927e34ae6ef281ee64f38595acc
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return getClass().getSimpleName();
	}
	
}
