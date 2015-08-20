package negocio;

import entidades.Partida;
import datos.CatalogoPartida;

public class ControladorPartida {
	
	private CatalogoPartida catPartida;
	
	public void iniciarPartida()
	{
		catPartida = new CatalogoPartida();
		catPartida.iniciarPartida();
	}
	

}
