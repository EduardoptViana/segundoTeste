package petshop;

public class Animal {
	
	
	protected String nome;
	protected Raca raca;
	protected double peso;
	protected String doenca;
	protected String diagnostico;
	
      
	
	
	
	public Animal(String nome, Raca raca, double peso) {
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		
	}
	
	
	
	
	public Animal(String nome, Raca raca, double peso, String doenca,
			String diagnostico) {
		
		this(nome, raca, peso);
		this.doenca = doenca;
		this.diagnostico = diagnostico;
	}




	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getDoenca() {
		return doenca;
	}
	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public Raca getRaca() {
		return raca;
	}

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", raca=" + raca + ", diagnostico=" + diagnostico + '}';
    }
	
	
	

}
