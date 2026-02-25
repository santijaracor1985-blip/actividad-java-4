package com.example;

public class CamionDeReparto extends Transporte {

    private boolean tieneRefrigeracion;

    public CamionDeReparto(String id, double combustible, double capacidad, boolean tieneRefrigeracion) {
        super(id, combustible, capacidad);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
public void viajar(int distancia) {

    double consumo;

    if (tieneRefrigeracion) {
        consumo = (distancia / 10.0) * 2;
    } else {
        consumo = distancia / 10.0;
    }

    if (getCombustible() >= consumo) {
        setCombustible(getCombustible() - consumo);
        System.out.println("Camión viajó " + distancia + " km.");
    } else {
        System.out.println("Camión no tiene suficiente combustible.");
    }
}
}