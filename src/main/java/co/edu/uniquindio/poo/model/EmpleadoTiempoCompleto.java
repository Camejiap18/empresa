package co.edu.uniquindio.poo.model;

public class EmpleadoTiempoCompleto extends Empleado{
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String identificacion, double salarioMensual){
        super(nombre, identificacion);
        this.salarioMensual = salarioMensual;
    }

    //Métodos getters y setters
    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
    //Método de la clase padre 
    @Override
    public double calcularSalario() {
        return salarioMensual;
    }

    
    
    
}
