package oficial2.anewhope;

import java.util.Date;

public class InternacaoAdulto extends Internacao implements Internavel {

	public InternacaoAdulto(Paciente paciente, String convenio) {
		super(paciente, convenio);
		this.dataInternacao = new Date();
	}

	@Override
	public void interna(Hospital hospital) {

		Internacao[] adultos = hospital.getAdultos();

		if (estaCheioDeAdultos(adultos))
			throw new LeitoIndisponivelException();
		else {
			adultos[leitoDiponivel(adultos)] = new InternacaoAdulto(paciente,
					"Convenio");
			dataInternacao = new Date();
		}

	}

	private int leitoDiponivel(Internacao[] adultos) {
		for (int i = 0; i < adultos.length; i++) {
			if (adultos[i] == null)
				return i;
		}
		return -1;// nunca ocorrerá
	}

	public boolean estaCheioDeAdultos(Internacao[] adultos) {
		for (int i = 0; i < adultos.length; i++) {
			if (adultos[i] == null)
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "InternacaoAdulto [paciente=" + paciente + "]";
	}

	@Override
	public void daAlta(Paciente paciente, Hospital hospital) {

	}

}
