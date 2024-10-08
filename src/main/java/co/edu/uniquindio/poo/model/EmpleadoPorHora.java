package co.edu.uniquindio.poo.model;

public class EmpleadoPorHora extends Empleado{

    private double horasTrabajadas; 
    private int salarioPorHora;

    private EmpleadoPorHora(String nombre, String identificacion, double horasTrabajadas, int salarioPorHora){
        super(nombre, identificacion);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    //Métodos getters y setters
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(int salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    //Método de la clase Padre
    @Override
    public double calcularSalario() {
        return horasTrabajadas*salarioPorHora;
    }

}
