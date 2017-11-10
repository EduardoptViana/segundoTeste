package fabricadinamica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// o dinamismo ocorre porque a classe que � instanciada na linha
			// 25 da FabricaDinamica eh o que est� no arquivo de propriedades,
			// permitindo flexibilidade sem alteracao no c�digo. Ex:
			// uma classe especifica para um cliente
			
			FabricaDinamica fb = new FabricaDinamica("properties.txt");
			fb.criaImplementacao(fabricadinamica.FazAlgo.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
