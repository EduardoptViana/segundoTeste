package arraylist;

public class SuperHeroi implements IHeroi, Comparable<SuperHeroi>{
	
	private String nome;
	
	private String identidadeSecreta;
	
	private int forca;

	
	
	public SuperHeroi(String nome, String identidadeSecreta) {
		
		this.nome = nome;
		this.identidadeSecreta = identidadeSecreta;
	}

	

	public String getNome() {
		return nome;
	}



	@Override
	public String getIdentidadeSecreta() {
		return identidadeSecreta;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((identidadeSecreta == null) ? 0 : identidadeSecreta
						.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuperHeroi other = (SuperHeroi) obj;
		if (identidadeSecreta == null) {
			if (other.identidadeSecreta != null)
				return false;
		} else if (!identidadeSecreta.equals(other.identidadeSecreta))
			return false;
		return true;
	}



	@Override
	public int compareTo(SuperHeroi o) {
		
		return this.getIdentidadeSecreta().compareTo(o.getIdentidadeSecreta());
	}



	public int getForca() {
		return forca;
	}



	public void setForca(int forca) {
		this.forca = forca;
	}



	



	
	
	
}
