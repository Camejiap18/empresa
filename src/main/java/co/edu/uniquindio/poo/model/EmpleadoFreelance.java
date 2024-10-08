package co.edu.uniquindio.poo.model;

public class EmpleadoFreelance extends Empleado{
    private int proyectosCompletados;
    private double pagoPorProyecto;

    public EmpleadoFreelance(String nombre, String identificacion, int proyectosCompletados, double pagoPorProyecto){
        super(nombre, identificacion);
        this.proyectosCompletados = proyectosCompletados;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    //Métodos getters y setters
    public int getProyectosCompletados() {
        return proyectosCompletados;
    }

    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }
    
    //Método de la clase padre
    @Override
    public double calcularSalario() {
        return proyectosCompletados*pagoPorProyecto;
    }



}
