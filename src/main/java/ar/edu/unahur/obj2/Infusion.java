package ar.edu.unahur.obj2;

public abstract class Infusion {

    public void preparar(){
        calentarAgua();
        prepararInfusion();
        servir();
        agregarCondimentos();
    }

    protected void calentarAgua(){
        System.out.println("Caliento agua");
    }

    protected void servir(){
        System.out.println("Sirvo en una taza");
    }

    protected abstract void agregarCondimentos();

    protected abstract void prepararInfusion();
}
