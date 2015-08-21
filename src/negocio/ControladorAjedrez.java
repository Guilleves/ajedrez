package negocio;

import entidades.Jugador;
import datos.CatalogoTorre;
import datos.CatalogoJugador;

public class ControladorAjedrez {

	private CatalogoJugador cj;
	
	public Jugador mandarJugadorPrueba()
	{
		cj = new CatalogoJugador();
		cj.ja();
		return cj.mandarJugadorPrueba();
	}
}

