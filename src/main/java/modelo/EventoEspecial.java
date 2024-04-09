package modelo;

import java.time.LocalDate;

public class EventoEspecial extends Permiso {
	private String tipoEvento;
	private int cantidadAsistentes;
	private String medidasSeguridad;

	public String getTipoEvento() {
		return this.tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getCantidadAsistentes() {
		return this.cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public String getMedidasSeguridad() {
		return this.medidasSeguridad;
	}

	public void setMedidasSeguridad(String medidasSeguridad) {
		this.medidasSeguridad = medidasSeguridad;
	}

	public EventoEspecial(LocalDate fechaEmision, LocalDate fechaVencimiento, int identificador, int costoBase, String tipoEvento, int cantidadAsistentes, String medidasSeguridad) {
		super(fechaEmision, fechaVencimiento, identificador, costoBase);
		this.tipoEvento = tipoEvento;
		this.cantidadAsistentes = cantidadAsistentes;
		this.medidasSeguridad = medidasSeguridad;
	}
	public double costoPermiso() {
		return costoBase + ((cantidadAsistentes/100)*100000);
	}
	@Override
	public String getTipoPermiso() {
		return "Evento Especial";
	}

	@Override
	public void mostrarDetallesPermiso() {
		System.out.println("Fecha de emision: " + fechaEmision);
		System.out.println("Fecha de vencimiento: " + fechaVencimiento);
		System.out.println("Identificador: "+ identificador);
		System.out.println("Costo base: " + costoBase);
		System.out.println("Costo total: " + costoPermiso());
		System.out.println("Tipo de evento: " + tipoEvento);
		System.out.println("Cantidad de asistentes: " + cantidadAsistentes);
		System.out.println("Medidas de seguridad: " + medidasSeguridad);
	}
}