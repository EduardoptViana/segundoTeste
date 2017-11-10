package strategy;

public class Ordenador {
	
	Ordenavel metodoDeOrdenacao;
	
	public Ordenador(Ordenavel metodoDeOrdenacao){
		this.metodoDeOrdenacao=metodoDeOrdenacao;
	}
	
	
	public void fazOrdenacao(){
		// independentemente do objeto que veio no construtor
		// faz a ordena��o espec�fica
		metodoDeOrdenacao.ordena();
		
	}

}
