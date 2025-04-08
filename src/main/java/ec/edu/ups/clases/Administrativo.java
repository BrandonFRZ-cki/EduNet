package ec.edu.ups.clases;

import java.util.List;

public class Administrativo extends Persona{
    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo() {}

    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<String> cargos, List<String> responsabilidades) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.cargos = cargos;
        this.responsabilidades = responsabilidades;
    }

}
