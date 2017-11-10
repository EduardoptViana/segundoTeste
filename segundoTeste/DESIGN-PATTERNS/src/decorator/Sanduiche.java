package decorator;

public abstract class Sanduiche {
	
	protected String descricao;
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public abstract double calcularCusto();

}
