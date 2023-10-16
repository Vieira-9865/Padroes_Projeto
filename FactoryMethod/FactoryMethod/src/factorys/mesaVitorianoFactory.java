package factorys;

import Model.movel;
import Model.movelFactory;
import mesa.mesaArtDeco;
import mesa.mesaCentroVitoriano;

public class mesaVitorianoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new mesaCentroVitoriano();

	}

}

