package excecoes;


public class CristianoException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Exception excecaoEncapsulada;
	
	
	
	public CristianoException(String msf, Exception ex){
		super("cristiano exception" +msf);
		this.excecaoEncapsulada = ex;
	}

}
