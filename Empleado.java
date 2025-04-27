package PracticoHerenciaYPolimorfismo;

public abstract class Empleado {
    private int DNI;
    private String nombre;
    private String apellido;
    private int anio_ingreso;

    public Empleado(int DNI, String nombre, String apellido, int anio_ingreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anio_ingreso = anio_ingreso;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnio_ingreso() {
        return anio_ingreso;
    }

    public void setAnio_ingreso(int anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    public abstract double montoACobrar();

    public String mostrarSalario() {
        return "El salario del empleado"+ this.getNombre() + " es: $" + montoACobrar();
    }
}
