package exercicios.exercicio2;

class Apolice {
	
	String nome;
	int idade;
	double valorPremio;
	
	
	void imprimir(){
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Premio: "+valorPremio);
		
	}
	
	void calcularPremio(){
		double percentual = 0;
		
		if(idade >=18 && idade <=25)
			percentual = 0.2;
		else if(idade >25 && idade <=36)
			percentual = 0.15;
		else
			percentual = 0.1;
		
		valorPremio = valorPremio + (valorPremio*percentual);
		
	}
	
	void oferecerDesconto(String cidade){
		double desconto = 0;
		if(cidade.equalsIgnoreCase("Ilhota"))
			desconto = 0.2;
		else if(cidade.equalsIgnoreCase("Blumenau"))
			desconto = 0.15;
		else if(cidade.equalsIgnoreCase("itajai"))
			desconto = 0.1;
		valorPremio = valorPremio - (valorPremio*desconto);
		
	}
	

}
