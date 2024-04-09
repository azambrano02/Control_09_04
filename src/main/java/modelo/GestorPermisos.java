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
	public boolean ciudadanoExiste(Ciudadano ciudadano){
		for (Ciudadano c : this.ciudadanos){
			if(ciudadano.getRut()==c.getRut()){
				return true;
			}
		} return false;
	}
	public void agregarCiudadano(Ciudadano ciudadano){
		if(!ciudadanoExiste(ciudadano)){
			this.ciudadanos.add(ciudadano);
			System.out.println("Ciudadano " + ciudadano.getNombre() + " agregado correctamente");
		}
	}
	public boolean permisoExiste(Permiso permiso){
		for (Permiso p : this.permisos){
			if(permiso.getIdentificador()==p.getIdentificador()){
				return true;
			}
		} return false;
	}
	public void registrarPermiso(Permiso permiso){
		if(!permisoExiste(permiso)){
			this.permisos.add(permiso);
			System.out.println("Permiso registrado correctamente");
		}
	}
	public List<Permiso> buscarPermisosCiudadano(Ciudadano ciudadano){
		List<Permiso> permisosCiudadano = ciudadano.getPermisos();
		System.out.println("Permisos del Ciudadano guardados correctamente");
		return permisosCiudadano;
	}
	public List<Permiso> buscarPermisos(String tipo, LocalDate fechaEmision, LocalDate fechaVencimiento){
		List<Permiso> permisosTipo = new ArrayList<>();
		for(Permiso permiso : this.permisos){
			if(permiso.getTipoPermiso().equals(tipo)&&permiso.getFechaEmision().equals(fechaEmision)&&permiso.getFechaVencimiento().equals(fechaVencimiento)){
				permisosTipo.add(permiso);
			}
		} return permisosTipo;
	}
	public void mostrarPermisosCiudadano(Ciudadano ciudadano){
		List<Permiso> permisosMostrar = buscarPermisosCiudadano(ciudadano);
		System.out.println("Los permisos del ciudadano se mostraran a continuacion: ");
		for(Permiso permiso : permisosMostrar){
			System.out.println(permiso.getIdentificador());
		}
	}
	public void mostrarInfoPermiso(Permiso permiso){
		permiso.mostrarDetallesPermiso();
	}
}