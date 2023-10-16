package factorys;

import Model.movel;
import Model.movelFactory;
import sofa.sofaModerno;
import sofa.sofaVitoriano;

public class sofaVitorianoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new sofaVitoriano();

	}

}
