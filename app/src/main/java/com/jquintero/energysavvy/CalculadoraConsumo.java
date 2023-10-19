package com.jquintero.energysavvy;

public class CalculadoraConsumo {

    public static int calcularConsumoDiario(Electrodomestico electrodomestico, int horasUso){
        return (int) (electrodomestico.getPotencia() * horasUso);
    }
}
