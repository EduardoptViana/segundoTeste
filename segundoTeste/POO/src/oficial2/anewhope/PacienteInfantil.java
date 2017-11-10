package oficial2.anewhope;

public class PacienteInfantil extends Paciente {

	private Paciente responsavel;

	public PacienteInfantil(String nome, int idade, Paciente responsavel) {
		super(nome, idade);
		this.responsavel = responsavel;
		
	}

}
