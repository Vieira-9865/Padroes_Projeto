package sofa;

import Model.Movel;
import Model.MovelFactory;

public class Sofa_ModernoFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new SofaModerno();
	}

}

