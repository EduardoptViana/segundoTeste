package builder;

import java.io.File;

public class EmailBuilder {
	private Email email;
	
	public Email getEmail() {
		return email;
	}

	public EmailBuilder(Email email){
		this.email=email;
	}

	public EmailBuilder destinatario(String d){
		email.getDestinatarios().add(d);
		return this;
	}
	
	public EmailBuilder anexo(File f){
		email.getAnexos().add(f);
		return this;
	}
	
	public EmailBuilder assunto(String s){
		email.setAssunto(s);
		return this;
	}
	
	public EmailBuilder mensagem(String s){
		email.setMensagem(s);
		return this;
	}
	
}
