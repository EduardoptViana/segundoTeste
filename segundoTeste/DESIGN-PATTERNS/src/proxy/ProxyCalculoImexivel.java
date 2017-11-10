package proxy;

public class ProxyCalculoImexivel {

	private CalculoImexivel ci;
	
	public ProxyCalculoImexivel (CalculoImexivel ci){
		this.ci=ci;
	}
	
	public double calcular(double v){
		double valor = ci.calcular(v);
		valor = valor*0.12; // encapsula a operacao com seu calculo particular
		return valor;
	}
}
