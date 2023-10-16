package sofa;

import Model.movel;
import Model.movelFactory;

public class SofaVitorianoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new SofaVitoriano();

	}

}
