package entities.fuel;

import entities.Vehicle;

public class FuelVehicle extends Vehicle {
    private double consumoMedio;      // km/L
    private double nivelCombustivel;  // litros
    private double capacidadeTanque;  // litros

    public FuelVehicle(String modelo, String marca, String chassi, double consumoMedio, double capacidadeTanque) {
        super(modelo, marca, chassi);
        this.consumoMedio = consumoMedio;
        this.capacidadeTanque = capacidadeTanque;
        this.nivelCombustivel = capacidadeTanque; // começa cheio
    }

    public void abastecer(double litros) {
        nivelCombustivel += litros;
        if (nivelCombustivel > capacidadeTanque) {
            nivelCombustivel = capacidadeTanque;
        }
    }

    public void atualizarConsumo(double distancia) {
        if (distancia > 0 && consumoMedio > 0) {
            double combustivelGasto = distancia / consumoMedio;
            nivelCombustivel -= combustivelGasto;
            if (nivelCombustivel < 0) nivelCombustivel = 0;
        }
    }

    @Override
    public double calcularAutonomia() {
        return consumoMedio * nivelCombustivel;
    }

    @Override
    public String toString() {
        return super.toString() +
               " | Combustão [Consumo médio=" + consumoMedio + " km/L" +
               ", Combustível=" + nivelCombustivel + " L" +
               ", Capacidade tanque=" + capacidadeTanque + " L]";
    }

   
    public double getConsumoMedio() { return consumoMedio; }
    public void setConsumoMedio(double consumoMedio) { this.consumoMedio = consumoMedio; }

    public double getNivelCombustivel() { return nivelCombustivel; }
    public void setNivelCombustivel(double nivelCombustivel) { this.nivelCombustivel = nivelCombustivel; }

    public double getCapacidadeTanque() { return capacidadeTanque; }
    public void setCapacidadeTanque(double capacidadeTanque) { this.capacidadeTanque = capacidadeTanque; }
}
