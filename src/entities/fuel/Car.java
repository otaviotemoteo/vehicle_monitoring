package entities.fuel;

public class Car extends FuelVehicle {
    private double desgastePneus;
    private double nivelOleo;
    private int kmProximaManutencao;
    private String statusPneu;

    public Car(String modelo, String marca, String chassi, double consumoMedio, double capacidadeTanque) {
        super(modelo, marca, chassi, consumoMedio, capacidadeTanque);
        this.desgastePneus = 0;
        this.nivelOleo = 100;
        this.kmProximaManutencao = 10000;
        this.statusPneu = "Bom";
    }

    public String verificarPneus() { return statusPneu; }

    public void trocarOleo() { nivelOleo = 100; }

    public double calcularDesgastePneus() { return desgastePneus; }

    public void agendarManutencao() {
        System.out.println("Manutenção agendada para " + kmProximaManutencao + " km.");
    }

    @Override
    public String toString() {
        return super.toString() +
               " | Carro [Nível de óleo=" + nivelOleo + "%" +
               ", Desgaste pneus=" + desgastePneus + "%" +
               ", Status pneus=" + statusPneu +
               ", Próxima manutenção=" + kmProximaManutencao + " km]";
    }

    
    public double getDesgastePneus() { return desgastePneus; }
    public void setDesgastePneus(double desgastePneus) { this.desgastePneus = desgastePneus; }

    public double getNivelOleo() { return nivelOleo; }
    public void setNivelOleo(double nivelOleo) { this.nivelOleo = nivelOleo; }

    public int getKmProximaManutencao() { return kmProximaManutencao; }
    public void setKmProximaManutencao(int kmProximaManutencao) { this.kmProximaManutencao = kmProximaManutencao; }

    public String getStatusPneu() { return statusPneu; }
    public void setStatusPneu(String statusPneu) { this.statusPneu = statusPneu; }
}
