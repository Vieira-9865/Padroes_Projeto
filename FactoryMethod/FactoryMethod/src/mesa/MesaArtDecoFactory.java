package mesa;

import Model.movel;
import Model.movelFactory;

public class MesaArtDecoFactory implements movelFactory {

	@Override
	public movel createMovel() {
		return new mesaArtDeco();

	}

}
