package factorys;

import Model.movel;
import Model.movelFactory;
import sofa.sofaModerno;
import sofa.sofaArtDeco;

public class sofaArtDecoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new sofaArtDeco();

	}

}
