package modelo;

import java.time.LocalDate;

public abstract class Permiso {
	protected LocalDate fechaEmision;
	protected LocalDate fechaVencimiento;
	protected int identificador;
	protected int costoBase;

	public LocalDate getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public LocalDate getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public int getCostoBase() {
		return costoBase;
	}
	public void setCostoBase(int costoBase) {
		this.costoBase = costoBase;
	}
	public abstract double costoPermiso();
	public abstract String getTipoPermiso();
	public Permiso(LocalDate fechaEmision, LocalDate fechaVencimiento, int identificador, int costoBase) {
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
		this.identificador = identificador;
		this.costoBase = costoBase;
	}
	public abstract void mostrarDetallesPermiso();
}