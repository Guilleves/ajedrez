package datos;

import java.util.ArrayList;

import entidades.Jugador;
import entidades.Trebejo;
import entidades.Torre;
import entidades.Rey;

public class CatalogoJugador {
	private Jugador j = new Jugador();
	private ArrayList<Trebejo> trebejos = new ArrayList<Trebejo>();
	
	
	public void ja()
	{

		
		for (int i = 0; i < 2; i++)
		{
			Trebejo t = new Torre();
			t.setPosX(i);
			t.setPosY(i);
			t.setTipo("torre");
			trebejos.add(t);
		}	

		
		for (int i = 2; i < 4; i++)
		{
			Trebejo t = new Rey();
			t.setPosX(i);
			t.setPosY(i);
			t.setTipo("Rey");
			trebejos.add(t);
		}	
		
	
		j.setTrebejos(trebejos);
	}

	
	public Jugador mandarJugadorPrueba()
	{
		return j;
	}
}
