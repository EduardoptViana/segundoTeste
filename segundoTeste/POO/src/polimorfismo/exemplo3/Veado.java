package polimorfismo.exemplo3;

public class Veado extends Animal {

	@Override
	public String emitirSom() {
		return "Vamo são paulo, vamo sao paulo, vamo ser campeão...ui";
	}

	public void serCacado() {

		System.out.println("Socorro...socorro, um leão quer me pegar!!!");

	}
}
