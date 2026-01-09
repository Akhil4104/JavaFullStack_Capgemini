package Has_A_Practice;

public class Mobile {
	SIM sim;
	Mobile(SIM sim){
		this.sim=sim;
	}
	void details() {
		System.out.println(sim.network);
		System.out.println(sim.number);
	}
}
