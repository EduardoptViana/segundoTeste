package factory;

public class DeptoRH {
	
	private CargoFactory cargoFactory;
	
	public DeptoRH(CargoFactory cf){
		cargoFactory=cf;
	}

	
	public Cargo contratar(String tipo){
		
		return cargoFactory.criaFuncionario(tipo);
		
	}
	
}
