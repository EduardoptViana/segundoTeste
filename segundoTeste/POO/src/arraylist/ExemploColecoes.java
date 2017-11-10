package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploColecoes {

	public static void main(String[] args) {

		List<IHeroi> listaDePersonagens = new ArrayList<IHeroi>();

		SuperHeroi demolidor = new SuperHeroi("Demolidor", "Matthew Murdock");
		demolidor.setForca(5);

		SuperHeroi capitaoAmerica = new SuperHeroi("Capitao America",
				"Steve Rogers");
		capitaoAmerica.setForca(7);

		SuperHeroi homemAranha = new SuperHeroi("Homem Aranha", "Peter Parker");
		homemAranha.setForca(8);

		SuperHeroi venom = new SuperHeroi("Homem Aranha", "Peter Parker");
		venom.setForca(10);
		SuperHeroi tochaHumena = new SuperHeroi("Tocha Humana", "Johnny Storm");
		tochaHumena.setForca(3);

		listaDePersonagens.add(capitaoAmerica);
		listaDePersonagens.add(demolidor);
		listaDePersonagens.add(homemAranha);
		listaDePersonagens.add((tochaHumena));
		listaDePersonagens.add(venom);

		System.out.println("aleatoria");
		for (IHeroi heroi : listaDePersonagens)
			System.out.println(heroi.getIdentidadeSecreta());

		System.out.println();

		System.out.println("ordenadas");

		// Collections.sort(listaDePersonagens);// comparable
		Collections.sort(listaDePersonagens, new ProviderForcaSuperHeroi()); // comparator
		
		
		/**
		 * Collections.sort(listaDePersonagens, new Comparator<IHeroi>() {
		 * 
		 * @Override public int compare(IHeroi o1, IHeroi o2) { return
		 *           (o1.getForca() - o2.getForca()); }
		 * 
		 *           }
		 * 
		 *           );
		 */
		/**
		 * listaDePersonagens .stream() .sorted((p1, p2) ->
		 * (p1.getIdentidadeSecreta()
		 * .compareTo(p2.getIdentidadeSecreta())))//ordena .forEach(p ->
		 * System.out.println(p.getIdentidadeSecreta()));
		 */
		// for(SuperHeroi heroi: listaDePersonagens)
		// System.out.println(heroi.getNome()+"-"+heroi.getForca());

	}

}
