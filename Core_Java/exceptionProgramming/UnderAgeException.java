package exceptionProgramming;

public class UnderAgeException extends RuntimeException{
	String message;
	UnderAgeException(){
		
	}
	UnderAgeException(String message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
