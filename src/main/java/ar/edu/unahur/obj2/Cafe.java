package ar.edu.unahur.obj2;

public class Cafe extends Infusion {

    protected void agregarCondimentos() {
        System.out.println("Agregar condimentos del cafe");
    }

    protected void prepararInfusion(){
        System.out.println("Pasar agua caliente sobre los granos de cafe");
    }
}
