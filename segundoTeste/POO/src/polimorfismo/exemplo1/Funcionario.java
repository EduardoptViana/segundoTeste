package polimorfismo.exemplo1;

/**
 * Classe abstrata na hierarquia de herança Não pode ser instanciada, devido ao
 * modificador abstract
 * 
 * @author crfranco
 *
 */
public abstract class Funcionario implements Calculadora {

	protected int matricula;
	protected String nome;
	protected double salario;

	public Funcionario(int matricula, String nome) {

		this.matricula = matricula;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}

	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public double getSalario() {
		return salario;
	}

}
