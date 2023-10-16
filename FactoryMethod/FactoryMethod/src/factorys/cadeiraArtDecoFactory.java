package factorys;

import Model.movel;
import Model.movelFactory;
import cadeira.cadeiraModerna;
import cadeira.cadeiraArtDeco;

public class cadeiraArtDecoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new cadeiraArtDeco();

	}

}
