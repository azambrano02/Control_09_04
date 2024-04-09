package modelo;

import java.time.LocalDate;

public class Negocio extends Permiso {
	private double tamañoLocal;
	private int empleados;

	public double getTamañoLocal() {
		return this.tamañoLocal;
	}

	public void setTamañoLocal(double tamañoLocal) {
		this.tamañoLocal = tamañoLocal;
	}

	public int getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}

	public Negocio(LocalDate fechaEmision, LocalDate fechaVencimiento, int identificador, double tamañoLocal, int empleados) {
		super(fechaEmision, fechaVencimiento, identificador);
		this.tamañoLocal = tamañoLocal;
		this.empleados = empleados;
	}

	public void costoPermiso() {
		throw new UnsupportedOperationException();
	}
}