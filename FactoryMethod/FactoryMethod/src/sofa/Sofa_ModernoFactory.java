package sofa;

import Model.movel;
import Model.movelFactory;

public class Sofa_ModernoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new SofaModerno();
	}

}

