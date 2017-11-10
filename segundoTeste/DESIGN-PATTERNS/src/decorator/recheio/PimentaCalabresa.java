package decorator.recheio;

import decorator.RecheioDecorator;
import decorator.Sanduiche;

public class PimentaCalabresa extends RecheioDecorator{
	
private Sanduiche sanduiche;
	
	public PimentaCalabresa(Sanduiche sanduiche){
		this.sanduiche=sanduiche;
	}
	
	@Override
	public String getDescricao() {
		return sanduiche.getDescricao()+" Pimenta Calabresa ";
	}

	@Override
	public double calcularCusto() {
		return sanduiche.calcularCusto() + 0.4;
	}

}
