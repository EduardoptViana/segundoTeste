package videogame;

public class Videogame {
	
	protected String processador;
	protected double HD;
	protected Midia midia;
	
	
	public Videogame(String processador, double hD, Midia midia) {
		
		this.processador = processador;
		HD = hD;
		this.midia = midia;
	}


	public double getHD() {
		return HD;
	}


	public void setHD(double hD) {
		HD = hD;
	}


	public Midia getMidia() {
		return midia;
	}


	public void setMidia(Midia midia) {
		this.midia = midia;
	}


	public String getProcessador() {
		return processador;
	}


	@Override
	public String toString() {
		return "Videogame [processador=" + this.processador + ", midia=" + this.midia
				+ "]";
	}
	
	
	

}
