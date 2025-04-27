package PracticoHerenciaYPolimorfismo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("Empresa 1");
        EmpleadoSalarioFijo empleado1 = new EmpleadoSalarioFijo(47955479, "Juan", "Rodriguez", 2020, 500000.0);
        EmpleadoConComision empleado2 = new EmpleadoConComision(57799841, "Pedro", "Perez", 2021, 400000.0, 7, 80000.00);
        EmpleadoConComision empleado3 = new EmpleadoConComision(47845231, "Maria", "Gomez", 2021, 400000.0, 4, 80000.00);

        ArrayList<EmpleadoSalarioFijo> empleadosSalarioFijo = new ArrayList<>();
        ArrayList<EmpleadoConComision> empleadosConComision = new ArrayList<>();

        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);

        empleado1.mostrarSalario();
        empleado2.mostrarSalario();
        empleado3.mostrarSalario();

        empleadosConComision.add(empleado2);
        empleadosConComision.add(empleado3);

        EmpleadoConComision empleadoConMasClientes(){
            for ()
        }

    }
}
