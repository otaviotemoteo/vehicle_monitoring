package entities.eletric;

public class Drone extends ElectricVehicle {
    private double altitudeMax;
    private double tempoVoo;       
    private double altitudeAtual;
    private String statusVoo; // "Pousado", "Em voo"

    public Drone(String modelo, String marca, String chassi, double capacidadeMedia, double autonomia, double altitudeMax, double tempoVoo) {
        super(modelo, marca, chassi, capacidadeMedia, autonomia);
        this.altitudeMax = altitudeMax;
        this.tempoVoo = tempoVoo;
        this.altitudeAtual = 0;
        this.statusVoo = "Pousado";
        this.setAtivo(false); //começa desligado
    }

    public void ligar() {
        if (!isAtivo()) {
            setAtivo(true);
            System.out.println("Drone ligado.");
        } else {
            System.out.println("Drone já está ligado.");
        }
    }

    public void desligar() {
        if (isAtivo() && statusVoo.equals("Pousado")) {
            setAtivo(false);
            System.out.println("Drone desligado.");
        } else {
            System.out.println("Não é possível desligar. O drone deve estar pousado.");
        }
    }

    public void recarregarBateria() {
        if (!isAtivo() && statusVoo.equals("Pousado")) {
            setNivelBateria(100);
            System.out.println("Bateria recarregada para 100%.");
        } else {
            System.out.println("Não é possível recarregar. O drone deve estar desligado e pousado.");
        }
    }

    public void verProximaManutencao() {
        if (!isAtivo() && statusVoo.equals("Pousado")) {
            System.out.println("Próxima manutenção agendada em 30 horas de voo.");
        } else {
            System.out.println("Não é possível verificar manutenção. O drone deve estar desligado e pousado.");
        }
    }

    public void decolar() {
        if (isAtivo() && calcularTempoVooRestante() > 0) {
            statusVoo = "Em voo";
            altitudeAtual = altitudeMax * 0.1;
            System.out.println("Drone decolou. Altitude atual: " + altitudeAtual + " m.");
        } else {
            System.out.println("Não é possível decolar. Verifique se está ligado e se há bateria suficiente.");
        }
    }

    public void pousar() {
        if (statusVoo.equals("Em voo")) {
            statusVoo = "Pousado";
            altitudeAtual = 0;
            System.out.println("Drone pousou.");
        } else {
            System.out.println("Drone já está pousado.");
        }
    }

    public void registrarViagem(double km) {
        if (isAtivo()) {
            setKmRodados(getKmRodados() + km);
            System.out.println("Viagem registrada: " + km + " km. Total rodado: " + getKmRodados() + " km.");
        } else {
            System.out.println("Não é possível registrar viagem. O drone deve estar ligado.");
        }
    }

    public double calcularTempoVooRestante() {
        return (getNivelBateria() / 100) * tempoVoo;
    }

    @Override
    public String toString() {
        return super.toString() +
               " | Drone [" +
               "Altitude máxima=" + altitudeMax + " m" +
               ", Altitude atual=" + altitudeAtual + " m" +
               ", Tempo de voo=" + tempoVoo + " min" +
               ", Status do voo=" + statusVoo +
               "]";
    }

    
    public double getAltitudeMax() { return altitudeMax; }
    public void setAltitudeMax(double altitudeMax) { this.altitudeMax = altitudeMax; }

    public double getTempoVoo() { return tempoVoo; }
    public void setTempoVoo(double tempoVoo) { this.tempoVoo = tempoVoo; }

    public double getAltitudeAtual() { return altitudeAtual; }
    public void setAltitudeAtual(double altitudeAtual) { this.altitudeAtual = altitudeAtual; }

    public String getStatusVoo() { return statusVoo; }
    public void setStatusVoo(String statusVoo) { this.statusVoo = statusVoo; }
}
