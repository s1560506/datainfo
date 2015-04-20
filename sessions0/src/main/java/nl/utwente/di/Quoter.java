package nl.utwente.di;

public class Quoter {
	
	public double getBookPrice(String name) {
		if(name.equals("1")) {
			return 10.0;
		} else if (name.equals("2")) {
			return 45.0;
		} else if(name.equals("3")) {
			return 20.0;
		} else if(name.equals("4")) {
			return 35.0;
		} else if(name.equals("5")) {
			return 50.0;
		} else {
			return 0.0;
		}
	}
}
