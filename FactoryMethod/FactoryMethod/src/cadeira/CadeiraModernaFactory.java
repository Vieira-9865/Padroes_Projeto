package cadeira;

import Model.movel;
import Model.movelFactory;

public class CadeiraModernaFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new CadeiraModerna();

	}

}
