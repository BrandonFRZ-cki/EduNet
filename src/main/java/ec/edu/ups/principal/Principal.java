package ec.edu.ups.principal;

import ec.edu.ups.clases.*;
import ec.edu.ups.enums.Rol;
import ec.edu.ups.enums.TipoDireccion;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

//---------------- ESTUDIANTE

        Estudiante estudiante = new Estudiante("0107233710", "Brandon", "Rivera", "0983925885", "brandonfrz2006@gmail.com", "Computacion");
        Direccion direccionEstudiante = new Direccion(TipoDireccion.CASA, "-", "-", "-", "Cuenca", "Azuay", "Ecuador");
        estudiante.addDireccion(direccionEstudiante);

//---------------- DOCENTE

        Docente docente = new Docente("0102174263", "Rodrigo", "Rivera", "090000000", "roddrigo-rivera-perez@hotmail.com");
        Direccion direccionDocente = new Direccion(TipoDireccion.CASA, "Av. Mexico", "GUatemala", "2-1", "Cuenca", "Azuay", "Ecuador");
        docente.addDireccion(direccionDocente);

        docente.addAreasDeEspeciializacion("Pedagogia");
        docente.addAreasDeEspeciializacion("Meteorologia");

        docente.addTitulosAcademico("Masterado");
        docente.addTitulosAcademico("Licenciatura");

//---------------- ADMINISTRATIVO

        Administrativo administrativo = new Administrativo("0103176194", "Cecilia", "Zambrano", "0998910960", "Cecyzan@live.com");

        administrativo.addCargo("Director de Consegeria");
        administrativo.addCargo("Gerente de Servivio al Ciliente");

        administrativo.addResponsabilidade("Charlar");
        administrativo.addResponsabilidade("Convencer");

//---------------- VISITATE

        GregorianCalendar gregorianCalendar1 = new GregorianCalendar(2020, 4, 17);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(2025, 1, 16);
        Visitante visitante = new Visitante("0302174271", "Luis", "Rivera", "090001000", "luiz_tkd92@hotmail.com", "Saludar", gregorianCalendar1, gregorianCalendar2);

//---------------- ASIGNACION

        GregorianCalendar fechaDeber = new GregorianCalendar(2025, 4, 10);
        Asignacion asignacionEstudiante = new Asignacion(estudiante, fechaDeber, Rol.ESTUDIANTE);
        Asignacion asignacionDocente = new Asignacion(docente, fechaDeber, Rol.DOCENTE);

        Asignacion asignacionAdministrativo = new Asignacion(administrativo, fechaDeber, Rol.ADMINISTRATIVO);
        Asignacion asignacionVisitante = new Asignacion(visitante, fechaDeber, Rol.VISITANTE);


//---------------- INSTITUCION

        //-------- 1

        Institucion institucion1 = new Institucion("Institucion 1", 1);
        institucion1.addDireccion(TipoDireccion.INSTITUCION, "1 - Calle 1", "1 - Calle 2", "001", "Cuenca", "Azuay", "Ecuador");

        List<String> sedesI1 = new ArrayList();
        sedesI1.add("1 - Sede 1");
        sedesI1.add("1 - Sede 2");
        institucion1.setSedes(sedesI1);

        institucion1.addAsignacion(asignacionEstudiante);
        institucion1.addAsignacion(asignacionDocente);

        // --------- 2

        Institucion institucion2 = new Institucion("Institucion 2", 2);
        institucion2.addDireccion(TipoDireccion.INSTITUCION, "2 - Calle 1", "2 - Calle 2", "002", "Cuenca", "Azuay", "Ecuador");

        List<String> sedes2 = new ArrayList();
        sedes2.add("2 - Sede 1");
        sedes2.add("2 - Sede 2");
        institucion2.setSedes(sedes2);

        institucion2.addAsignacion(asignacionAdministrativo);
        institucion2.addAsignacion(asignacionVisitante);

    //------------- IMPRIMIR

        System.out.println(institucion1);
        System.out.println(institucion2);









    }
}
