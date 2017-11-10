package fabricadinamica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FabricaDinamica {
	private Properties props;

	public FabricaDinamica(String arquivo) throws FileNotFoundException,
			IOException {
		props = new Properties();
		props.load(new FileInputStream(arquivo));
	}

	public <E> E criaImplementacao(Class<E> inter) {
		String nomeClasse = props.getProperty(inter.getName());
		if (nomeClasse == null) {
			throw new IllegalArgumentException("Interface n�o configurada");
		}
		try {
			Class clazz = Class.forName(nomeClasse);
			if (inter.isAssignableFrom(clazz)) {
				return (E) clazz.newInstance();
			} else {
				throw new IllegalArgumentException(
						"Classe configurada n�o implementa a interface");
			}
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException("Classe configurada n�o existe",
					e);
		} catch (Exception e) {
			throw new IllegalArgumentException(
					"N�o foi poss�vel criar a implementa��o", e);
		}
	}

}