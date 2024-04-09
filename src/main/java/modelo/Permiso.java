package modelo;

import java.time.LocalDate;

public abstract class Permiso {
	protected LocalDate fechaEmision;
	protected LocalDate fechaVencimiento;
	protected int identificador;

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

	public abstract void costoPermiso();

	public Permiso(LocalDate fechaEmision, LocalDate fechaVencimiento, int identificador) {
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
		this.identificador = identificador;
	}
}