package sofa;

import Model.Movel;
import Model.MovelFactory;

public class SofaVitorianoFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new SofaVitoriano();

	}

}
