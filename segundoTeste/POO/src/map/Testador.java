package map;

import java.util.HashMap;
import java.util.Map;



public class Testador {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Hannibal Lecter");
		Pessoa p2 = new Pessoa(2, "Clarice Starling");
		Pessoa p3 = new Pessoa(3, "Will Graham");
		
		Map<Long, Pessoa> mapa = new HashMap<>();
		
		
		mapa.put(p1.getId(), p1);
		mapa.put(32l, p2);//pq é um literal do tipo Long
		mapa.put(p2.getId(), p3);
		mapa.put(222l, new Pessoa(222,"ximbinha"));
		mapa.put(67l, p3);
		
		for (Map.Entry<Long, Pessoa> elementoDaColecao : mapa.entrySet()) {
			System.out.print(elementoDaColecao.getKey());
			System.out.print(" - ");
			System.out.print(elementoDaColecao.getValue());
			System.out.println();
		}
		mapa.remove(32l);
		
		System.out.println(mapa.containsValue(new Pessoa(1,"Hannibal Lecter")));
		Pessoa procurada = mapa.get(222l);//
		System.out.println(procurada);
		
	}

}
