package ru.jcourse.less002.exceptions;

public class CanNotParseString  extends Exception{
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return getClass().getSimpleName();
	}
	
}
