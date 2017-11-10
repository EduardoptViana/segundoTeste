package fabricadinamica;

public class Implementacao implements FazAlgo{

	@Override
	public void fazAlgo() {
		System.out.println("estou fazendo outra coisa");
		
	}
	
	public Implementacao(){
		this.fazAlgo();
	}

}
