package entidades;

import java.util.ArrayList;

public class Jugador {
	private int dni;
	private String nombre,apellido;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private ArrayList<Trebejo> trebejos; 

	//Get-Set
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public ArrayList<Trebejo> getTrebejos()
	{
		return trebejos;
	}
	
	public void setTrebejos(ArrayList<Trebejo> trebejos)
	{
		this.trebejos = trebejos;
	}

}
