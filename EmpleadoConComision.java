package PracticoHerenciaYPolimorfismo;

public class EmpleadoConComision extends Empleado{
    private double salario_minimo;
    private int clientes_captados;
    private double montoPorCliente;

    public EmpleadoConComision(int DNI, String nombre, String apellido, int anio_ingreso, double salario_minimo, int clientes_captados, double montoPorCliente) {
        super(DNI, nombre, apellido, anio_ingreso);
        this.salario_minimo = salario_minimo;
        this.clientes_captados = clientes_captados;
        this.montoPorCliente = montoPorCliente;
    }

    public double getSalario_minimo() {
        return salario_minimo;
    }

    public void setSalario_minimo(double salario_minimo) {
        this.salario_minimo = salario_minimo;
    }

    public int getClientes_captados() {
        return clientes_captados;
    }

    public void setClientes_captados(int clientes_captados) {
        this.clientes_captados = clientes_captados;
    }

    public double getMontoPorCliente() {
        return montoPorCliente;
    }

    public void setMontoPorCliente(double montoPorCliente) {
        this.montoPorCliente = montoPorCliente;
    }

    @Override
    public double montoACobrar() {
        if(clientes_captados*montoPorCliente < salario_minimo){ return salario_minimo;
        }else { return clientes_captados*montoPorCliente ; }

    }


}
