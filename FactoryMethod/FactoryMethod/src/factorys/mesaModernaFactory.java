package factorys;

import Model.movel;
import Model.movelFactory;
import mesa.mesaArtDeco;
import mesa.mesaModerna;

public class mesaModernaFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new mesaModerna();

	}

}

