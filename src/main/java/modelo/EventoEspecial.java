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

	public EventoEspecial(LocalDate fechaEmision, LocalDate fechaVencimiento, int identificador, String tipoEvento, int cantidadAsistentes, String medidasSeguridad) {
		super(fechaEmision, fechaVencimiento, identificador);
		this.tipoEvento = tipoEvento;
		this.cantidadAsistentes = cantidadAsistentes;
		this.medidasSeguridad = medidasSeguridad;
	}

	public void costoPermiso() {
		throw new UnsupportedOperationException();
	}
}