package builder;

public class Tester {
	
	public static void main(String[] args){
		
		Email e = new Email("crfranco@gmail.com"
				,"juliana.paes@globo.com");
		
		EmailBuilder eb = new EmailBuilder(e);
		
		eb.destinatario("dancarinasfaustao@globo.com")
		  .destinatario("cytherea@xxx.com")
		  .destinatario("teste@teste.com")
		  .assunto("meninas do v�deo")
		  .mensagem("veja os arquivos em anexo.");
	
		System.out.println(eb.getEmail());
	}

}
