package decorator;

import decorator.recheio.Alface;
import decorator.recheio.Bacon;
import decorator.recheio.PimentaCalabresa;
import decorator.sanduiche.CarneEQueijo;
import decorator.sanduiche.ClubMelt;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		Sanduiche s = new ClubMelt();
		System.out.println(s.getDescricao());
		System.out.println(s.calcularCusto());
		*/
		
		
		
		
		
		
		
		
		Sanduiche s1 = new CarneEQueijo();
		//System.out.println(s1.calcularCusto());
		
		s1 = new Bacon(s1);
		s1 = new Alface(s1);
		s1 = new PimentaCalabresa(s1);
		s1 = new Bacon(s1);
		
		System.out.println(s1.getDescricao());
		System.out.println(s1.calcularCusto());

		
		
		
	}

}
