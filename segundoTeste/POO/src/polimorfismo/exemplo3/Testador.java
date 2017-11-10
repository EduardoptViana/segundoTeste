package polimorfismo.exemplo3;

public class Testador {

	public static void main(String[] args) {
		Animal[] zoologico = new Animal[4];

		zoologico[0] = new Galinha();
		zoologico[1] = new Cachorro();
		zoologico[2] = new Ornitorrinco();
		zoologico[3] = new Veado();

		for (int i = 0; i < zoologico.length; i++) {
			System.out.println(zoologico[i].emitirSom());
			System.out.println();

		}
	}
}
