package mesa;

import Model.Movel;
import Model.MovelFactory;

public class MesaArtDecoFactory implements MovelFactory {

	@Override
	public Movel createMovel() {
		return new mesaArtDeco();

	}

}
