package exceptionProgramming;

public class OverAgeException extends RuntimeException{
	String message;
	OverAgeException(){
		
	}
	OverAgeException(String message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
