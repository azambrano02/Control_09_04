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

	public Negocio(LocalDate fechaEmision, LocalDate fechaVencimiento, int identificador, int costoBase, double tamañoLocal, int empleados) {
		super(fechaEmision, fechaVencimiento, identificador, costoBase);
		this.tamañoLocal = tamañoLocal;
		this.empleados = empleados;
	}
	public double costoPermiso() {
		return costoBase + (tamañoLocal * 150000) + (empleados * 20000);
	}

	@Override
	public String getTipoPermiso() {
		return "Negocio";
	}

	@Override
	public void mostrarDetallesPermiso() {
		System.out.println("Fecha de emision: " + fechaEmision);
		System.out.println("Fecha de vencimiento: " + fechaVencimiento);
		System.out.println("Identificador: "+ identificador);
		System.out.println("Costo base: " + costoBase);
		System.out.println("Costo total: " + costoPermiso());
		System.out.println("Tamaño local: " + tamañoLocal);
		System.out.println("Cantidad de empleados: " +empleados);
	}
}