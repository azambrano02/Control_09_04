package modelo;

import java.sql.SQLOutput;
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
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Construccion(LocalDate fechaEmision, LocalDate fechaVencimiento, int identificador, int costoBase, double metrosCuadrados, String ubicacion, Tipo tipo) {
		super(fechaEmision, fechaVencimiento, identificador, costoBase);
		this.metrosCuadrados = metrosCuadrados;
		this.ubicacion = ubicacion;
		this.tipo = tipo;
	}

	public double costoPermiso() {
		return costoBase + (metrosCuadrados * 150000);
	}
	@Override
	public String getTipoPermiso() {
		return "Construccion";
	}

	@Override
	public void mostrarDetallesPermiso() {
		System.out.println("Fecha de emision: " + fechaEmision);
		System.out.println("Fecha de vencimiento: " + fechaVencimiento);
		System.out.println("Identificador: "+ identificador);
		System.out.println("Costo base: " + costoBase);
		System.out.println("Costo total: " + costoPermiso());
		System.out.println("Metros cuadrados: " + metrosCuadrados);
		System.out.println("Ubicacion: " + ubicacion);
		System.out.println("Tipo de construccion: " + tipo);
	}
}