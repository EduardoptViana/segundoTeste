package abstractfactory;

public class Testador {

	public static void main(String[] args) {
		PizzaStore ps = new PizzaStore();
		Pizza pizza = null;
		
		
		// pedindo uma de pepperoni no blupizza
		pizza =	ps.criarPizza(TipoPizza.PEPPERONI, new BluPizza());
		System.out.println(pizza);
		
		
		// pedindo uma de quatro queijos no don corleoni
		pizza = ps.criarPizza(TipoPizza.QUATRO_QUEIJOS, new DonCorleone());
		System.out.println(pizza);
		
	}

}
