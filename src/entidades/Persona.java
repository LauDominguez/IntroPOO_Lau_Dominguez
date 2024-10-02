package entidades;

public class Persona {
    //Declaración de Atributos
    public String DNI;          //32207436
    public String nombre;       //Laura Dominguez
    public int efectivo;        //1000
    public boolean tieneSueno;  //false
    public boolean tieneHambre; //true

    //Declaración de métodos
    public void comprar(Producto producto) {
        if (producto.getStock() ==0){
            System.out.println("Producto sin stock");
        }
        else {
            if (producto.getPrecio() <=efectivo){
                System.out.println("voy a comprar 1 "  + producto.getNombre());
                efectivo = efectivo - producto.getPrecio();
                producto.disminuirStock(1);
                System.out.println( "Me quedan " + efectivo + " de efectivo");
                System.out.println(" Stock actualizado, quedan: " + producto.getStock() + " " + producto.getNombre());
            }
        }

    }

}
