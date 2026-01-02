package hasARelationship;

public class App {

	public static void main(String[] args) {
		Cars c=new Cars();
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("MRF"));
		
		for(int i=0;i<c.tyres.length;i++) {
			System.out.println(c.tyres[i].getBrand());
		}
		/*for(int i=0;i<c.getTyres().length;i++) {
			System.out.println(c.getTyres()[i].getBrand());
		}*/
		Book b = new Book("Java OOPS");
	    System.out.println("Book Name: " + b.getBookName());
	    for (int i = 0; i < b.getPages().length; i++) {
	        System.out.println(b.getPages()[i].getPageContent());
	    }
	}
}
