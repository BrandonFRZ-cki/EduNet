package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Administrativo extends Persona{
    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo() {
        cargos = new ArrayList();
        responsabilidades = new ArrayList();
    }

    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        cargos = new ArrayList();
        responsabilidades = new ArrayList();
    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    public void addCargo(String cargo) {
        cargos.add(cargo);
    }
    public void addResponsabilidade(String responsabilidade) {
        responsabilidades.add(responsabilidade);
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "cargos=" + cargos +
                ", responsabilidades=" + responsabilidades +
                '}';
    }
}
