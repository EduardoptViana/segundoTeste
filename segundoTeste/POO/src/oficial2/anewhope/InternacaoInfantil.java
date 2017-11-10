package oficial2.anewhope;

import java.util.Date;

public class InternacaoInfantil extends Internacao implements Internavel {

	public InternacaoInfantil(Paciente paciente) {
		super(paciente);
		this.dataInternacao = new Date();
	}

	@Override
	public void interna(Hospital hospital) {
		// aqui vem a parte complexa
		Internacao[] criancas = hospital.getCriancas();
		if (infantilEstaLotado(criancas)) {
			Internacao[] adultos = hospital.getAdultos();
			if (!alocaNoAdulto(adultos))
				throw new LeitoIndisponivelException();
		}

	}

	/**
	 * Tem que testar, fiz com pressa
	 * 
	 * @param adultos
	 * @return
	 */
	private boolean alocaNoAdulto(Internavel[] adultos) {

		for (int i = 0; i < adultos.length; i++) {
			if (adultos[i] == null) {
				adultos[i] = this;
				return true;
			}
		}
		return false;

	}

	private boolean infantilEstaLotado(Internavel[] criancas) {
		for (int i = 0; i < criancas.length; i++) {
			if (criancas[i] == null)
				return false;
		}
		return true;
	}

	@Override
	public void daAlta(Paciente paciente, Hospital hospital) {
		// TODO Auto-generated method stub

	}

}
