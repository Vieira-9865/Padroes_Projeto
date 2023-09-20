package mesa;

import Model.Movel;
import Model.MovelFactory;

public class MesaModernaFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new MesaModerna();

	}

}

