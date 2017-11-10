package abstractfactory;

public class Pepperoni extends Pizza {

	public Pepperoni(PizzaFactory pizzaFactory) {
		super(pizzaFactory);
		
	}

	@Override
	public void cozinhar() {
		molho = pizzaFactory.criarMolho();
		massa = pizzaFactory.criarMassa();
		
	}

}
