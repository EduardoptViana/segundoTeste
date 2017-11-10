package oficial2.anewhope;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hospital {

	private List<Paciente> listaPacientes;
	private Internacao[] adultos = new Internacao[60];
	private Internacao[] criancas = new Internacao[20];

	public void interna(Internacao internacao) {
		internacao.interna(this);
	}

	public Internacao[] getAdultos() {
		return adultos;
	}

	public Internacao[] getCriancas() {
		return criancas;
	}

	public List<Paciente> getPacientes() {

		List<Paciente> lista = new ArrayList<>();

		// melhorar esta parte de enchimento do vetor
		for (int i = 0; i < adultos.length; i++) {
			if (adultos[i] != null)
				lista.add(adultos[i].getPaciente());
		}

		for (int i = 0; i < criancas.length; i++) {
			if (adultos[i] != null)
				lista.add(criancas[i].getPaciente());
		}
		
		// so compila com java8
		lista.sort((p1, p2) -> p2.getNome().compareToIgnoreCase(p1.getNome()));
		listaPacientes = lista;

		return listaPacientes;

	}

	// so compila com java8
	public Paciente maisVelho() {
		return listaPacientes.stream()
				.max(Comparator.comparingInt(p -> p.getIdade())).get();

	}
}