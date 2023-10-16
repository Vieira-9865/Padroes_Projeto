package factorys;

import Model.movel;
import Model.movelFactory;
import cadeira.cadeiraModerna;
import cadeira.cadeiraVitoriano;

public class cadeiraVitorianoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new cadeiraVitoriano();

	}

}
