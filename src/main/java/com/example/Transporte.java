package com.example;

public class Transporte {

    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        setCombustible(combustible);
        setCapacidadCarga(capacidadCarga);
    }


    public double getCombustible() {
        return combustible;
    }

    public String getIdTransporte() {
        return idTransporte;
    }


  public void setCombustible(double nivel) {
    if (nivel >= 0) {
        this.combustible = nivel;
    } else {
        this.combustible = 0;
    }
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            System.out.println("Error: La capacidad no puede ser negativa.");
        } else {
            this.capacidadCarga = carga;
        }
    }

  
    public void viajar(int distancia) {
        double consumo = distancia / 10.0; 
        combustible -= consumo;

        if (combustible < 0) {
            combustible = 0;
        }

        System.out.println(idTransporte + " viajó " + distancia + " km.");
    }
}