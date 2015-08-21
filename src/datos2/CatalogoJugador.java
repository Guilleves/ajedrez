package datos2;


import java.util.ArrayList;

import entidades.Jugador;
import entidades.Trebejo;
import entidades.Torre;
import entidades.Rey;

public class CatalogoJugador {
	private Jugador blanco = new Jugador(), negro = new Jugador();
	private CatalogoTrebejo catTre = new CatalogoTrebejo();
	
	public void llenarTrebejos()
	{

		jugador.setTrebejos(catTre.getTrebejos());
	}

	
	public Jugador setJugador()
	{
		return jugador;
	}
}