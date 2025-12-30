package ObjectProgram;

public class Box {
	//non-static variable
	double length;
	double breadth;
	//constructor
	Box(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	//non-static method 
	public double getArea() {
		return length*breadth; 
	}
	
}
