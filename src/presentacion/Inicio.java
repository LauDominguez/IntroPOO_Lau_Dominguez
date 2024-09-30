package presentacion;

import entidades.Persona;

public class Inicio {
    public static void main (String[] args){

        //tipodedato    nombrevariable  =valor
        int             a               = 10;
        Persona         p1              = new Persona();

        p1.DNI = "32207436";
        p1.nombre = "Laura Dominguez";
        p1.efectivo = 1000;
        p1.tieneSueno = false;
        p1.tieneHambre = true;

        System.out.println("A es un entero y almacena: " + a);
        System.out.println("p1 es un objeto y almacena: " + p1);
    }

}
