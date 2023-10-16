package cadeira;

import Model.Movel;
import Model.MovelFactory;

public class CadeiraModernaFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new CadeiraModerna();

	}

}
