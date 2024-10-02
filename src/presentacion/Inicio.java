package presentacion;

import entidades.Persona;
import entidades.Producto;

public class Inicio {
    public static void main (String[] args){

        //tipodedato    nombrevariable  =valor
        //int             a               = 10;
        Persona         p1              = new Persona(); //constructor por defecto, sin variables iniciales
        Producto        papasLays       = new Producto();

        p1.DNI = "32207436";
        p1.nombre = "Laura Dominguez";
        p1.efectivo = 1000;
        p1.tieneSueno = false;
        p1.tieneHambre = true;

        /* esto es si los atributos son publicos
        papasLays.nombre = "Papas Lays 125gr";
        papasLays.descripcion = "Libre de Gluten";
        papasLays.stock = 10;
        papasLays.precio = 50; */

        papasLays.setNombre("Papas Lays de 125gr");
        System.out.println(papasLays.getNombre());
        papasLays.setDescripcion("Libre de Gluten");
        papasLays.setStock(10);
        papasLays.setPrecio(50);

      //  System.out.println("A es un entero y almacena: " + a);
      //  System.out.println("p1 es un objeto y almacena: " + p1);

        p1.comprar(papasLays); //llamo al metodo y puedo hacer interactuar las clases producto y persona
    }

}
