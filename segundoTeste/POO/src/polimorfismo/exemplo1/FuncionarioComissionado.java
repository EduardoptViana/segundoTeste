package polimorfismo.exemplo1;

public class FuncionarioComissionado extends Funcionario {

	private double comissao;

	public FuncionarioComissionado(int matricula, String nome, double salario,
			double comissao) {
		super(matricula, nome);
		this.comissao = comissao;
		this.salario = salario;

	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		this.salario += this.comissao;
		return this.salario;
	}

}
