package decorator.sanduiche;

import decorator.Sanduiche;


public class ClubMelt extends Sanduiche{
	
	public ClubMelt(){
		descricao = "ClubMelt";
	}
	
	@Override
	public double calcularCusto() {
		
		return 6.00;
	}

}
