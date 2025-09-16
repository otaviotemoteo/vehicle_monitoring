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

    
    public void ligar() {
        if (!isAtivo()) {
            setAtivo(true);
            System.out.println("Carro ligado com sucesso!");
        } else {
            System.out.println("O carro já está ligado!");
        }
    }

    public void desligar() {
        if (isAtivo()) {
            setAtivo(false);
            System.out.println("Carro desligado com sucesso!");
        } else {
            System.out.println("O carro já está desligado!");
        }
    }

    public void fazerManutencao() {
        if (isAtivo()) {
            System.out.println("ERRO: Não é possível fazer manutenção com o carro ligado!");
            return;
        }

        boolean precisaManutencao = false;

        if (nivelOleo < 30) {
            trocarOleo();
            precisaManutencao = true;
        }

        if (desgastePneus > 70 || !statusPneu.equals("Bom")) {
            trocarPneus();
            precisaManutencao = true;
        }

        if (precisaManutencao) {
            System.out.println("Manutenção completa realizada!");
        } else {
            System.out.println("O carro não precisa de manutenção no momento.");
        }
    }

    
    private void trocarPneus() {
        desgastePneus = 0;
        statusPneu = "Bom";
        System.out.println("Pneus trocados!");
    }

    public String verificarPneus() { return statusPneu; }
    public void trocarOleo() { nivelOleo = 100; }
    public double calcularDesgastePneus() { return desgastePneus; }
    public void agendarManutencao() {
        System.out.println("Manutenção agendada para " + kmProximaManutencao + " km.");
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
