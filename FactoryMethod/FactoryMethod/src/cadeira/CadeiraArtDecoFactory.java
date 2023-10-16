package cadeira;

import Model.movel;
import Model.movelFactory;

public class CadeiraArtDecoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new cadeiraArtDeco();

	}

}
