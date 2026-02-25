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
    if (nivel < 0) {
        this.combustible = 0;
    } else if (nivel > 100) {
        this.combustible = 100;
    } else {
        this.combustible = nivel;
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