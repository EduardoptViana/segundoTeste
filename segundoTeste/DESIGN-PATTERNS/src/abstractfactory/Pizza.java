package abstractfactory;

public abstract class Pizza {
	
	PizzaFactory pizzaFactory;

	public Pizza(PizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}
	
	protected String nome;
	protected Massa massa;
	protected Molho molho;
	
	public void preparar(){
		cozinhar();// factory method
		this.assar();
		this.cortar();
		this.encaixotar();
	}
	
	public abstract void cozinhar();

	public void assar(){
		System.out.println("Assando a pizza");
	}
	
	public void cortar(){
		System.out.println("Cortando a pizza");
	}
	
	public void encaixotar(){
		System.out.println("Encaixotando a pizza");
	}

	@Override
	public String toString() {
		return "Pizza [nome=" + nome + ", massa=" + massa.getDescricao() + ", molho=" + molho.getDescricao()
				+ "]";
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	
}
