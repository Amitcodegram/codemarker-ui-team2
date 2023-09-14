package in.codemarker.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TestIdException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * this will create projectIdException object without error message
	 */
	public TestIdException() {
		super();
	}
	
	/**
	 * this will create projectIdException object with error message
	 */
     public TestIdException(String errMsg) {
		super(errMsg);
	}
	
}
