package ru.jcourse.less002.exceptions;

public class CanNotFindVariable extends RuntimeException {
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return getClass().getSimpleName();
	}
}
