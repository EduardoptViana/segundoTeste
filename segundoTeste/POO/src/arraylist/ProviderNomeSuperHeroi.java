package arraylist;

import java.util.Comparator;

public class ProviderNomeSuperHeroi implements Comparator<IHeroi>{

	@Override
	public int compare(IHeroi o1, IHeroi o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

	

}
