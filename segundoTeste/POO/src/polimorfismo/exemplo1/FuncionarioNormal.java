package polimorfismo.exemplo1;

public class FuncionarioNormal extends Funcionario{

	public FuncionarioNormal(int matricula, String nome, double salario) {
		super(matricula, nome);
		this.salario = salario;
	}

	@Override
	public double calcularSalario() {
		return this.salario;
	}
	
	

}
