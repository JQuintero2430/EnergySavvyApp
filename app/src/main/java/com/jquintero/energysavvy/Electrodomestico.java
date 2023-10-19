package com.jquintero.energysavvy;

public class Electrodomestico {
    private String nombre;
    private double potencia;
    private double eficiencia;

    public Electrodomestico(String nombre, double potencia, double eficiencia) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.eficiencia = eficiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }
}
