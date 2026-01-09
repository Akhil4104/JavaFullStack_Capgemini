package Has_A_Practice;

public class MobileMain {
	public static void main(String args[]) {
		SIM s=new SIM("5G",978254685);
		Mobile m=new Mobile(s);
		m.details();
	}
}
