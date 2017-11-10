package petshop;

public class Dono {

	private String nome;
	private String endereco;

	private Animal animal;

	public Dono(String nome, String endereco, Animal animal) {

		this.nome = nome;
		this.endereco = endereco;
		this.animal = animal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Animal getAnimal() {
		return animal;
	}

	@Override
	public String toString() {
		return "Dono [nome=" + nome + ", animal=" + animal + "]";
	}

}
