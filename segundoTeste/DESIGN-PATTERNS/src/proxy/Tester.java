package proxy;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalculoImexivel ci = new CalculoImexivel();
		
		ProxyCalculoImexivel pci = new ProxyCalculoImexivel(ci);
		pci.calcular(23);

	}

}
