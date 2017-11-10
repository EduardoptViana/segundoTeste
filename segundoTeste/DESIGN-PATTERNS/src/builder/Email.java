package builder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Email {
	
	private String remetente;
	private List<String> destinatarios;
	private String assunto;
	private String mensagem;
	private List<File> anexos;
	
	public Email(String remetente, String destinatario){
		this.remetente = remetente;
		destinatarios = new ArrayList<String>();
		destinatarios.add(destinatario);
		
	}
	
	public void addDestinatario(String p){
		destinatarios.add(p);
	}
	
	public void addAnexo(File f){
		if (anexos==null)
			anexos=new ArrayList();
		anexos.add(f);
	}
	
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public List<File> getAnexos() {
		return anexos;
	}
	public void setAnexos(List<File> anexos) {
		this.anexos = anexos;
	}
	public String getRemetente() {
		return remetente;
	}
	public List<String> getDestinatarios() {
		return destinatarios;
	}

	@Override
	public String toString() {
		return "Email [remetente=" + remetente + ", destinatarios="
				+ destinatarios + ", assunto=" + assunto + ", mensagem="
				+ mensagem + ", anexos=" + anexos + "]";
	}
	
	

}
