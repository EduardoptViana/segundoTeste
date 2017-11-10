package decorator.sanduiche;

import decorator.Sanduiche;

public class CarneEQueijo extends Sanduiche{

	public CarneEQueijo(){
		descricao = "Carne e Queijo";
	}
	
	@Override
	public double calcularCusto() {
		
		return 5.67;
	}

}
