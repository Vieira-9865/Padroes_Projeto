package cadeira;

import Model.Movel;
import Model.MovelFactory;

public class CadeiraVitorianoFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new CadeiraVitoriano();

	}

}
