package factorys;

import Model.movel;
import Model.movelFactory;
import cadeira.cadeiraModerna;

public class CadeiraModernaFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new cadeiraModerna();

	}

}
