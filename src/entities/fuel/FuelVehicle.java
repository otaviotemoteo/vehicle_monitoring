package entities.fuel;

import entities.Vehicle;

public class FuelVehicle extends Vehicle {
    protected double consumoMedio;      // km/l
    protected double nivelCombustivel;  // litros
    protected double capacidadeTanque;  // litros

    public FuelVehicle(String modelo, String marca, String chassi, double consumoMedio, double capacidadeTanque) {
        super(modelo, marca, chassi);
        this.consumoMedio = consumoMedio;
        this.capacidadeTanque = capacidadeTanque;
        this.nivelCombustivel = capacidadeTanque; // tanque cheio ao criar
    }

    public void abastecer(double litros) {
        if (nivelCombustivel + litros <= capacidadeTanque) {
            nivelCombustivel += litros;
        } else {
            nivelCombustivel = capacidadeTanque;
        }
        System.out.println("Abastecido. Nível atual: " + nivelCombustivel + " L");
    }

    @Override
    public double calcularAutonomia() {
        return consumoMedio * nivelCombustivel;
    }

    public void atualizarConsumo(double distancia) {
        double gasto = distancia / consumoMedio;
        nivelCombustivel -= gasto;
        if (nivelCombustivel < 0) nivelCombustivel = 0;
    }
}
