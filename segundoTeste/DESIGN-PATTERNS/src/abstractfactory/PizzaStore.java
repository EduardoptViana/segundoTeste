package abstractfactory;

public class PizzaStore {
	
	public Pizza criarPizza(TipoPizza tipoPizza, PizzaFactory pizzaria){
		Pizza pizza = null;
		
		
		
		switch(tipoPizza){
		case PEPPERONI:
			pizza = new Pepperoni(pizzaria);
			
			break;
		case QUATRO_QUEIJOS:
			pizza = new QuatroQueijos(pizzaria);
			break;
		}
		pizza.setNome(tipoPizza.toString());
		pizza.preparar();
		return pizza;
		
	}

}
