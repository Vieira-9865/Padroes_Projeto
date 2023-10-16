package mesa;

import Model.movel;
import Model.movelFactory;

public class MesaVitorianoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new mesaCentroVitoriano();

	}

}

