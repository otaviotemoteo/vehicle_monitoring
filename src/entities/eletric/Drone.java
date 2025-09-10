package entities.eletric;

public class Drone extends EletricVehicle {
    private double altitudeMax;
    private double tempoVoo;       
    private double altitudeAtual;
    private String statusVoo;

    public Drone(String modelo, String marca, String chassi, double capacidadeMedia, double autonomia, double altitudeMax, double tempoVoo) {
        super(modelo, marca, chassi, capacidadeMedia, autonomia);
        this.altitudeMax = altitudeMax;
        this.tempoVoo = tempoVoo;
        this.altitudeAtual = 0;
        this.statusVoo = "Pronto para decolar";
    }

    public void decolar() {
        statusVoo = "Em voo";
        altitudeAtual = altitudeMax * 0.1;
        System.out.println("Drone decolou. Altitude atual: " + altitudeAtual);
    }

    public void pousar() {
        statusVoo = "Pousado";
        altitudeAtual = 0;
        System.out.println("Drone pousou.");
    }

    public double calcularTempoVooRestante() {
        return (nivelBateria / 100) * tempoVoo;
    }

    public void agendarManutencao() {
        System.out.println("Manutenção preventiva do drone agendada.");
    }
}
