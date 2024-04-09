package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorPermisos {
	private List<Permiso> permisosRealizados;
	private LocalDate fechaSolicitud;
	private ArrayList<Ciudadano> ciudadanos;
	private ArrayList<Permiso> permisos;

	public List<Permiso> getPermisosRealizados() {
		return permisosRealizados;
	}

	public void setPermisosRealizados(List<Permiso> permisosRealizados) {
		this.permisosRealizados = permisosRealizados;
	}

	public LocalDate getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(LocalDate fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public ArrayList<Ciudadano> getCiudadanos() {
		return ciudadanos;
	}

	public void setCiudadanos(ArrayList<Ciudadano> ciudadanos) {
		this.ciudadanos = ciudadanos;
	}

	public ArrayList<Permiso> getPermisos() {
		return permisos;
	}

	public void setPermisos(ArrayList<Permiso> permisos) {
		this.permisos = permisos;
	}
	public GestorPermisos(LocalDate fechaSolicitud) {
		this.permisosRealizados = new ArrayList<>();
		this.fechaSolicitud = fechaSolicitud;
		this.ciudadanos = new ArrayList<>();
		this.permisos = new ArrayList<>();
	}
}