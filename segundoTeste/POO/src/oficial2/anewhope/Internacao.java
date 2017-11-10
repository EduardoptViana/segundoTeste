package oficial2.anewhope;

import java.util.Date;

public abstract class Internacao implements Internavel{
	
	 
		protected Paciente paciente;
		protected String convenio;
		protected Date dataInternacao;
		
		
		
		public Internacao(Paciente paciente) {
			super();
			this.paciente = paciente;
		}
		public Internacao(Paciente paciente, String convenio) {
			super();
			this.paciente = paciente;
			this.convenio = convenio;
		}
		public Paciente getPaciente() {
			return paciente;
		}
		public void setPaciente(Paciente paciente) {
			this.paciente = paciente;
		}
		public String getConvenio() {
			return convenio;
		}
		public void setConvenio(String convenio) {
			this.convenio = convenio;
		}
		
		

}
