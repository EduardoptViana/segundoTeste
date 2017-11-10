package fabricadinamica;

public class Concreta implements FazAlgo{

	@Override
	public void fazAlgo() {
		System.out.println("estou fazendo algo.");
		
	}

	public Concreta(){
		this.fazAlgo();
	}
}
