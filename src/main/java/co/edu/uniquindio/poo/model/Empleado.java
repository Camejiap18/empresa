package co.edu.uniquindio.poo.model;

public abstract class Empleado {
    private String nombre, identificacion;

    public Empleado(String nombre,String identificacion){
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    //Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    //Método abstracto
    public abstract double calcularSalario();
}
    
    


