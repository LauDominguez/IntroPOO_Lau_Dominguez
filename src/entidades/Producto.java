package entidades;

public class Producto {

    //Atributos
    private String nombre;
    private String descripcion;
    private int stock;
    private int precio;

    public void disminuirStock(int cantidad){
        stock = stock - cantidad;
    }
/*
    //accesadores y mutadores
    //metodo para acceder el atributo
    public String getNombre(){
        return nombre;
    }

    //metodo para modificar el atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
