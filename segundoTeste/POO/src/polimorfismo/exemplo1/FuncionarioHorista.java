package polimorfismo.exemplo1;

public class FuncionarioHorista extends Funcionario {

	private double nroHoras;
	private double valorHora;

	public FuncionarioHorista(int matricula, String nome, double nroHoras,
			double valorHora) {
		super(matricula, nome);
		this.nroHoras = nroHoras;
		this.valorHora = valorHora;

	}

	@Override
	public double calcularSalario() {
		this.salario = nroHoras * valorHora;
		return salario;
	}

	public double getNroHoras() {
		return nroHoras;
	}

	public void setNroHoras(double nroHoras) {
		this.nroHoras = nroHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

}
