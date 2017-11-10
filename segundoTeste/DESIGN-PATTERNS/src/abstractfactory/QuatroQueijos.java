package abstractfactory;

public class QuatroQueijos extends Pizza{
	
	

	public QuatroQueijos(PizzaFactory pizzaFactory) {
		super(pizzaFactory);
		
		
	}

	@Override
	public void cozinhar() {
		molho = pizzaFactory.criarMolho();
		massa = pizzaFactory.criarMassa();
		
		
	}
	
	

}
