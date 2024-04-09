package modelo;

public class Ciudadano {
	private String nombre;
	private int rut;
	private int edad;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRut() {
		return this.rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Ciudadano(String nombre, int rut, int edad) {
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
	}
}