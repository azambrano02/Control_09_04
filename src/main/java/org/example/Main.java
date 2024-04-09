package org.example;

import modelo.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ciudadano ciudadano1 = new Ciudadano("Alan", 209599325, 22);
        Negocio ngeocio1 = new Negocio(LocalDate.now(), LocalDate.now().plusDays(5), 1234, 50000, 20.5, 10);
        EventoEspecial evento1 = new EventoEspecial(LocalDate.now(), LocalDate.now().plusDays(5), 4321, 50000, "Cumpleaños", 12, "Medidas basicas de seguridad");
        Construccion construccion1 = new Construccion(LocalDate.now(), LocalDate.now().plusDays(5),2211,50000, 40.5,"Casa de alan",Tipo.RESIDENCIAL);
        GestorPermisos municipalidad = new GestorPermisos(LocalDate.now());
        List<Permiso> permisos = new ArrayList<>();
        permisos.add(evento1);
        permisos.add(construccion1);
        permisos.add(ngeocio1);
        ciudadano1.setPermisos(permisos);
        municipalidad.agregarCiudadano(ciudadano1);
        municipalidad.registrarPermiso(ngeocio1);
        municipalidad.registrarPermiso(evento1);
        municipalidad.registrarPermiso(construccion1);
        municipalidad.buscarPermisos("Construccion", LocalDate.now(),LocalDate.now().plusDays(5));
        municipalidad.buscarPermisosCiudadano(ciudadano1);
        municipalidad.mostrarInfoPermiso(evento1);
        municipalidad.mostrarInfoPermiso(construccion1);



    }
}