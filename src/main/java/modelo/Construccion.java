package modelo;

import java.time.LocalDate;

public class Construccion extends Permiso {
	private double metrosCuadrados;
	private String ubicacion;
	private Tipo tipo;

	public double getMetrosCuadrados() {
		return this.metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Construccion(LocalDate fechaEmision, LocalDate fechaVencimiento, int identificador, double metrosCuadrados, String ubicacion, Tipo tipo) {
		super(fechaEmision, fechaVencimiento, identificador);
		this.metrosCuadrados = metrosCuadrados;
		this.ubicacion = ubicacion;
		this.tipo = tipo;
	}
	public void costoPermiso() {
		throw new UnsupportedOperationException();
	}
}