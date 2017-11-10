package videogame;

public class Kinect {
	
	private String descricao;

	public Kinect(String descricao) {
		
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "Kinect [descricao=" + descricao + "]";
	}
	
	

}
