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
			throw new IllegalArgumentException("Interface não configurada");
		}
		try {
			Class clazz = Class.forName(nomeClasse);
			if (inter.isAssignableFrom(clazz)) {
				return (E) clazz.newInstance();
			} else {
				throw new IllegalArgumentException(
						"Classe configurada não implementa a interface");
			}
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException("Classe configurada não existe",
					e);
		} catch (Exception e) {
			throw new IllegalArgumentException(
					"Não foi possível criar a implementação", e);
		}
	}

}