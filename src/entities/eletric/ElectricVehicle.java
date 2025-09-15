package entities.eletric;

import entities.Vehicle;

public class ElectricVehicle extends Vehicle {
	private double capacidadeMedia;  //kWh
	private double autonomia;        //km
	private double nivelBateria;     //%
	private int ciclosRecarga;

    public ElectricVehicle(String modelo, String marca, String chassi, double capacidadeMedia, double autonomia) {
        super(modelo, marca, chassi);
        this.capacidadeMedia = capacidadeMedia;
        this.autonomia = autonomia;
        this.nivelBateria = 100;
        this.ciclosRecarga = 0;
    }

    public void recarregar(double percentual) {
        nivelBateria += percentual;
        if (nivelBateria > 100) nivelBateria = 100;
        ciclosRecarga++;
        System.out.println("Bateria recarregada para " + nivelBateria + "%.");
    }

    @Override
    public double calcularAutonomia() {
        return (nivelBateria / 100) * autonomia;
    }

	public double getCapacidadeMedia() {
		return capacidadeMedia;
	}

	public void setCapacidadeMedia(double capacidadeMedia) {
		this.capacidadeMedia = capacidadeMedia;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	public double getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(double nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

	public int getCiclosRecarga() {
		return ciclosRecarga;
	}

	public void setCiclosRecarga(int ciclosRecarga) {
		this.ciclosRecarga = ciclosRecarga;
	}
}
