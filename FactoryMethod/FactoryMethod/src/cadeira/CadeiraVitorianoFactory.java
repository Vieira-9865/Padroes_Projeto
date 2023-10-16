package cadeira;

import Model.movel;
import Model.movelFactory;

public class CadeiraVitorianoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new CadeiraVitoriano();

	}

}
