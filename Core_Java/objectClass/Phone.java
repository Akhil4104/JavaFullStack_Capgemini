package objectClass;

public class Phone {
	int ram;
	int rom;
	Phone(int ram,int rom){
		this.ram=ram;
		this.rom=rom;
	}
	public String toString() {
		return "Phone -->[ Ram:"+ram+" Rom: "+rom+" ] ";
	}
}
