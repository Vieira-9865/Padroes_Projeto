package mesa;

import Model.Movel;
import Model.MovelFactory;

public class MesaVitorianoFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new MesaCentroVitoriano();

	}

}

