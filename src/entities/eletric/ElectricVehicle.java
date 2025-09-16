package entities.eletric;

import entities.Vehicle;

public class ElectricVehicle extends Vehicle {
    private double capacidadeMedia;  // em kWh
    private double autonomia;        // em km
    private double nivelBateria;     // em %
    private int ciclosRecarga;

    public ElectricVehicle(String modelo, String marca, String chassi, double capacidadeMedia, double autonomia) {
        super(modelo, marca, chassi);
        this.capacidadeMedia = capacidadeMedia;
        this.autonomia = autonomia;
        this.nivelBateria = 100.0;
        this.ciclosRecarga = 0;
    }

    public void recarregar(double percentual) {
        if (percentual <= 0) {
            System.out.println("Valor de recarga inválido.");
            return;
        }
        nivelBateria += percentual;
        if (nivelBateria > 100) {
            nivelBateria = 100;
        }
        ciclosRecarga++;
        System.out.println("Bateria recarregada. Nível atual: " + nivelBateria + "%");
    }

    @Override
    public double calcularAutonomia() {
        return (nivelBateria / 100) * autonomia;
    }

    @Override
    public String toString() {
        return super.toString() +
               " | Elétrico [" +
               "Capacidade=" + capacidadeMedia + " kWh" +
               ", Autonomia=" + autonomia + " km" +
               ", Bateria=" + nivelBateria + "%" +
               ", Ciclos recarga=" + ciclosRecarga +
               "]";
    }

    
	
    public double getCapacidadeMedia() { return capacidadeMedia; }
    public void setCapacidadeMedia(double capacidadeMedia) { this.capacidadeMedia = capacidadeMedia; }

    public double getAutonomia() { return autonomia; }
    public void setAutonomia(double autonomia) { this.autonomia = autonomia; }

    public double getNivelBateria() { return nivelBateria; }
    public void setNivelBateria(double nivelBateria) {
        if (nivelBateria < 0) this.nivelBateria = 0;
        else if (nivelBateria > 100) this.nivelBateria = 100;
        else this.nivelBateria = nivelBateria;
    }

    public int getCiclosRecarga() { return ciclosRecarga; }
    public void setCiclosRecarga(int ciclosRecarga) { this.ciclosRecarga = ciclosRecarga; }
}
