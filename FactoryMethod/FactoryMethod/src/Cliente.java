import factorys.CadeiraModernaFactory;
import factorys.mesaArtDecoFactory;
import factorys.sofaVitorianoFactory;

public class Cliente {

	public static void main(String[] args) {
		CadeiraModernaFactory cadeira = new CadeiraModernaFactory();
		sofaVitorianoFactory sofa =  new sofaVitorianoFactory();
		mesaArtDecoFactory mesa = new mesaArtDecoFactory();
		
		cadeira.createMovel().descricao();
		sofa.createMovel().descricao();
		mesa.createMovel().descricao();
		

	}

}
