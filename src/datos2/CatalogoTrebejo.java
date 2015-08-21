package datos2;

import java.util.ArrayList;

import entidades.Torre;
import entidades.Trebejo;

public class CatalogoTrebejo {

	private ArrayList<Trebejo> trebejos;
	
	public void asdf()
	{
		for (int i = 0; i < 2; i++)
		{
			Trebejo t = new Torre();
			t.setPosX(i);
			t.setPosY(i);
			t.setTipo("torre");
			trebejos.add(t);
		}	
	}
	
	public ArrayList<Trebejo> getTrebejos()
	{
		return trebejos;
	}
	
}
