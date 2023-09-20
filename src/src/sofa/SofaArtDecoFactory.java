package sofa;

import Model.Movel;
import Model.MovelFactory;

public class SofaArtDecoFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new SofaArtDeco();

	}

}
