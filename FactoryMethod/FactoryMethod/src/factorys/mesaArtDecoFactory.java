package factorys;

import Model.movel;
import Model.movelFactory;
import cadeira.cadeiraModerna;
import mesa.mesaArtDeco;

public class mesaArtDecoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new mesaArtDeco();

	}

}
