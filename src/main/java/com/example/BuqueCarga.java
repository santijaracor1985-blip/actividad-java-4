package com.example;

public class BuqueCarga extends Transporte {

    private int cantidadContenedores;

    public BuqueCarga(String id, double combustible, double capacidad, int cantidadContenedores) {
        super(id, combustible, capacidad);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("El buque " + getIdTransporte() + " está listo para descarga.");
    }

    public void mostrarDatos() {
        System.out.println("ID: " + getIdTransporte());
        System.out.println("Combustible actual: " + getCombustible());
        System.out.println("Contenedores: " + cantidadContenedores);

        double costoViaje = getCombustible() * 5; // cálculo simple
        System.out.println("Costo de viaje: USD " + costoViaje);
    }
}