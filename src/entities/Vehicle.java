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
        this.ativo = true;
        this.kmRodados = 0.0;
    }
    
    public Vehicle() {
    }

    //comportamento
    public void acelerar(double velocidade) {
        this.velocidadeAtual += velocidade;
        System.out.println(marca + " " + modelo + " acelerou para " + this.velocidadeAtual + " km/h.");
    }

    public abstract double calcularAutonomia();

    public void registrarViagem(double km) {
        this.kmRodados += km;
        System.out.println("Viagem registrada: " + km + " km. Total rodado: " + kmRodados + " km.");
    }

    //get set retornando
    public String getModelo() { return modelo; }
    public String getMarca() { return marca; }
    public String getChassi() { return chassi; }
    public double getVelocidadeAtual() { return velocidadeAtual; }
    public double getKmRodados() { return kmRodados; }
    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    @Override
    public String toString() {
        return "Veículo [" + marca + " " + modelo + 
               ", Chassi=" + chassi + 
               ", Km rodados=" + kmRodados + 
               ", Velocidade atual=" + velocidadeAtual + " km/h]";
    }
}
