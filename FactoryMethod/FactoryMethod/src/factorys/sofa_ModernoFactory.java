package factorys;

import Model.movel;
import Model.movelFactory;
import mesa.mesaArtDeco;
import sofa.sofaModerno;

public class sofa_ModernoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new sofaModerno();

	}

}

