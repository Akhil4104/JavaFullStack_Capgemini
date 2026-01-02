package hasARelationship;

public class Cars {
	//private Tyre[] tyres= {new Tyre("MRF"),new Tyre("MRF"),new Tyre("MRF")};
	Tyre[] tyres=new Tyre[4];
	int i=0;
	void addTyre(Tyre tyre) {
		tyres[i]=tyre;
		i++;
	}
	/*public Tyre[] getTyres() {
		return tyres;
	}

	public void setTyres(Tyre[] tyres) {
		this.tyres = tyres;
	};
	*/
	
	
}
