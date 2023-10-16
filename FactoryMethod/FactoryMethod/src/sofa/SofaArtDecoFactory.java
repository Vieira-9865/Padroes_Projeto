package sofa;

import Model.movel;
import Model.movelFactory;

public class SofaArtDecoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new sofaArtDeco();

	}

}
