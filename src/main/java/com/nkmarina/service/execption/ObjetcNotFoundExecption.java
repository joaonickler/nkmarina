package com.nkmarina.service.execption;

public class ObjetcNotFoundExecption extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	
	public ObjetcNotFoundExecption (String msg) {
		super(msg);
	}

	public ObjetcNotFoundExecption (String msg, Throwable cause) {
		super(msg, cause);
	}
	
	
}
