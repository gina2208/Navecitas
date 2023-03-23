package clasesNaves;

public class Nave {

    private String nombre;
    private int capacidad;
    private double parsec;
    private double recorrido;
    private int cantidad;

 
    public Nave(String nombre, int capacidad, double parsec, double recorrido, int cantidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.parsec = parsec;
        this.recorrido = recorrido;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getParsec() {
        return parsec;
    }

    public void setParsec(double consumo) {
        this.parsec = consumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(double recorrido) {
        this.recorrido = recorrido;
    }

    public double calcularCombustible(double parsec) {
        return parsec * recorrido * cantidad;

    }

    public String mostrarDatos() {
        String info = "La nave " + getNombre() + "<br>" + "tiene una capacidad de: " + getCapacidad() + " pasajeros"+ "<br>" + " Usa " + getParsec() +" combustible en litros por Parsec"+ "<br>" + "Recorre" + getRecorrido()+" Parsec" + "<br>" + "Hay " + getCantidad()+" naves de este tipo";
        return info;
    }

}
