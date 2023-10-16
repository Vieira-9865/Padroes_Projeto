package cadeira;

import Model.Movel;
import Model.MovelFactory;

public class CadeiraArtDecoFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new CadeiraArtDeco();

	}

}
