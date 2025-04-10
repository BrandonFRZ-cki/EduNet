package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona {
    private List<String> titulosAcademicos;
    private List<String> areasDeEspeciializacion;

    public Docente() {
        titulosAcademicos = new ArrayList<String>();
        areasDeEspeciializacion = new ArrayList<>();
    }

    public Docente(String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        titulosAcademicos = new ArrayList<String>();
        areasDeEspeciializacion = new ArrayList<>();
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreasDeEspeciializacion() {
        return areasDeEspeciializacion;
    }

    public void setAreasDeEspeciializacion(List<String> areasDeEspeciializacion) {
        this.areasDeEspeciializacion = areasDeEspeciializacion;
    }
    public void addTitulosAcademico(String tituloAcademico) {
        titulosAcademicos.add(tituloAcademico);
    }
    public void addAreasDeEspeciializacion(String areaDeEspeciializacion) {
        areasDeEspeciializacion.add(areaDeEspeciializacion);
    }

    @Override
    public String toString() {
        return "Docente{" +
                "titulosAcademicos=" + titulosAcademicos +
                ", areasDeEspeciializacion=" + areasDeEspeciializacion +
                '}';
    }
}
