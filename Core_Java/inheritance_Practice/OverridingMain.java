package inheritance_Practice;

public class OverridingMain {
	public static void main(String args[]) {
		SBI s=new SBI();
		HDFC h=new HDFC();
		s.getInterestRate();
		h.getInterestRate();
	}
}
