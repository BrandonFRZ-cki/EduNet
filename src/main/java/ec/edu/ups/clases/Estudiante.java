package ec.edu.ups.clases;

import java.util.ArrayList;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(){}

    public Estudiante(String cedula, String nombre, String apellido, String telefono, String correoElectronico, String carrera) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "\n\tCarrera :"+carrera;
    }
}

