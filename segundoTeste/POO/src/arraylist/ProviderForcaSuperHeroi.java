package arraylist;

import java.util.Comparator;

public class ProviderForcaSuperHeroi implements Comparator<IHeroi>{

	@Override
	public int compare(IHeroi o1, IHeroi o2) {
		return (o1.getForca() - o2.getForca());
	}

	

	

}
