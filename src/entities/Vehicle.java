package entities;

public abstract class Vehicle {
    private String modelo;
    private String marca;
    private double velocidadeAtual;
    private String chassi;
    private boolean ativo;
    private double kmRodados;

    public Vehicle(String modelo, String marca, String chassi) {
        this.modelo = modelo;
        this.marca = marca;
        this.chassi = chassi;
        this.velocidadeAtual = 0.0;
        this.ativo = false;
        this.kmRodados = 0.0;
    }

    public Vehicle() {}

    public void acelerar(double velocidade) {
        this.velocidadeAtual += velocidade;
    }

    public abstract double calcularAutonomia();

    public void registrarViagem(double km) {
        this.kmRodados += km;
    }

    public String monitorarDesempenho() {
        return "Desempenho de " + marca + " " + modelo +
               ": Velocidade atual = " + velocidadeAtual + " km/h, Km rodados = " + kmRodados +
               ", Status = " + (ativo ? "Ativo" : "Inativo");
    }

    public String gerarRelatorio() {
        return "Relatório de " + marca + " " + modelo + "\n" +
               "Chassi = " + chassi + "\n" +
               "Km rodados = " + kmRodados + "\n" +
               "Velocidade atual = " + velocidadeAtual + " km/h\n" +
               "Status = " + (ativo ? "Ativo" : "Inativo") + "\n" +
               "Autonomia estimada = " + calcularAutonomia() + " km";
    }

    @Override
    public String toString() {
        return "Veículo [" + marca + " " + modelo +
               ", Chassi=" + chassi +
               ", Km rodados=" + kmRodados +
               ", Velocidade atual=" + velocidadeAtual + " km/h" +
               ", Status=" + (ativo ? "Ativo" : "Inativo") + "]";
    }

    
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public double getVelocidadeAtual() { return velocidadeAtual; }
    public void setVelocidadeAtual(double velocidadeAtual) { this.velocidadeAtual = velocidadeAtual; }

    public String getChassi() { return chassi; }
    public void setChassi(String chassi) { this.chassi = chassi; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    public double getKmRodados() { return kmRodados; }
    public void setKmRodados(double kmRodados) { this.kmRodados = kmRodados; }
}
