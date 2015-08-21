package datos;

import java.util.ArrayList;

import entidades.Trebejo;

public abstract class CatalogoTrebejo {
	protected ArrayList<Trebejo> trebejos = new ArrayList<Trebejo>();

	public abstract boolean sePuedeMover(int i, int j);
	
	
	public ArrayList<Trebejo> getLista()
	{
		return trebejos;
	}
}
