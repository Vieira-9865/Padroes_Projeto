package mesa;

import Model.movel;
import Model.movelFactory;

public class MesaModernaFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new MesaModerna();

	}

}

