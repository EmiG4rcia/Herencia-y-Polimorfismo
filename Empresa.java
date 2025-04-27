package PracticoHerenciaYPolimorfismo;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void removerEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void mostrarSalario() {
            for (Empleado e: empleados){
                System.out.println("El empleado "+e.getNombre() + "tiene un salario de $" + e.montoACobrar());
            }
        //return "El salario del empleado"+ this.getNombre() + " es: $" + montoACobrar();
    }

    public Empleado empleadoConMasClientes() {
        int max = 0;
        Empleado empleadoConMasClientes = null;
        for (Empleado e: empleados) {
            if(e instanceof EmpleadoConComision) {
                EmpleadoConComision ecc = (EmpleadoConComision) e;
                int cant= ecc.getClientes_captados();
                if (cant > max) {
                    max = cant;
                    empleadoConMasClientes = ecc;
                }
            }
        }
        return empleadoConMasClientes;
    }


}
