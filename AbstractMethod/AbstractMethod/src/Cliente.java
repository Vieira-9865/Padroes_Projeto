import cadeira.CadeiraModernaFactory;
import mesa.MesaArtDecoFactory;
import sofa.SofaVitorianoFactory;

public class Cliente {

	public static void main(String[] args) {
		CadeiraModernaFactory cadeira = new CadeiraModernaFactory();
		SofaVitorianoFactory sofa =  new SofaVitorianoFactory();
		MesaArtDecoFactory mesa = new MesaArtDecoFactory();
		
		cadeira.createMovel().descricao();
		sofa.createMovel().descricao();
		mesa.createMovel().descricao();
		

	}

}
