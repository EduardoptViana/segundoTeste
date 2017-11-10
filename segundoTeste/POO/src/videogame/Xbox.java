package videogame;

public class Xbox extends Videogame{
	private String descricao;
	private Kinect kinect;
	
	
	
	public Kinect getKinect() {
		return kinect;
	}



	public void setKinect(Kinect kinect) {
		this.kinect = kinect;
	}



	public Xbox(String processador, double hD, Midia midia,
			String descricao) {
		super(processador, hD, midia);
		this.descricao = descricao;
	}



	@Override
	public String toString() {
		return "Xbox "+kinect+ " "+ super.toString();
	}



	

	

}
