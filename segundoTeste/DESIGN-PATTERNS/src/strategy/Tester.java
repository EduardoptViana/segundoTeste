package strategy;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ordenador o = new Ordenador(new BubbleSort());
		o.fazOrdenacao();
		
		Ordenador o1 = new Ordenador(new MergeSort());
		o1.fazOrdenacao();

	}

}
