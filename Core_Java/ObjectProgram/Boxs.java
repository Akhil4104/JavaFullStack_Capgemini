package ObjectProgram;

public class Boxs {
	double length;
	Boxs(){
		
	}
	Boxs(double length){
		this.length=length;
	}
	public static Boxs createBox() {
		return new Boxs();
	}
	public static Boxs createBox(double length) {
		return new Boxs(length);
	}
	
}
