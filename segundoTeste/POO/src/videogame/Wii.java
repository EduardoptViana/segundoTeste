package videogame;

public class Wii extends Videogame{

	public Wii(String processador, double hD, Midia midia) {
		super(processador, hD, midia);
		
	}

	@Override
	public String toString() {
		return "Wii "+ super.toString() ;
	}

	
	
}
