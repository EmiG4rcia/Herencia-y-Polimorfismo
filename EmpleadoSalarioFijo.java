package PracticoHerenciaYPolimorfismo;

public class EmpleadoSalarioFijo extends Empleado {
    private double sueldoBasico;

    public EmpleadoSalarioFijo(int DNI, String nombre, String apellido, int anio_ingreso, double sueldoBasico) {
        super(DNI, nombre, apellido, anio_ingreso);
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double montoACobrar() {
        double sueldo = 0;
        if(getAnio_ingreso() >= 2023){
            sueldo= sueldoBasico;
        }else if(getAnio_ingreso()>=2020) {
            sueldo = sueldoBasico * 1.05;
        }else if(getAnio_ingreso()<2020){
            sueldo= sueldoBasico * 1.1;
        }
        return sueldo;
    }


}
