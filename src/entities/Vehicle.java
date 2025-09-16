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

	// comportamento
	public void acelerar(double velocidade) {
		this.velocidadeAtual += velocidade;
		System.out.println(marca + " " + modelo + " acelerou para " + this.velocidadeAtual + " km/h.");
	}

	public double calcularAutonomia() {
        //valor generico para o calculo de autonomia
        return 500.0;
    }

    public String monitorarDesempenho() {
        return "Desempenho de " + marca + " " + modelo + ":\n" +
               "Velocidade atual = " + velocidadeAtual + " km/h\n" +
               "Km rodados = " + kmRodados + " km\n" +
               "Status do veículo = " + (ativo ? "Ativo" : "Inativo") + "\n";
    }

    public String gerarRelatorio() {
        return "===== Relatório de " + marca + " " + modelo + " =====\n" +
               "Chassi = " + chassi + "\n" +
               "Km rodados = " + kmRodados + " km\n" +
               "Velocidade atual = " + velocidadeAtual + " km/h\n" +
               "Status do veículo = " + (ativo ? "Ativo" : "Inativo") + "\n" +
               "Autonomia Estimada = " + calcularAutonomia() + " km\n";
    }

	public void registrarViagem(double km) {
		this.kmRodados += km;
		System.out.println("Viagem registrada: " + km + " km. Total rodado: " + kmRodados + " km.");
	}

	@Override
public String toString() {
    return "Veículo [" +
           "Marca=" + marca +
           ", Modelo=" + modelo +
           ", Chassi=" + chassi +
           ", Km rodados=" + kmRodados +
           ", Velocidade atual=" + velocidadeAtual + " km/h" +
           ", Status=" + (ativo ? "Ativo" : "Inativo") +
           "]";
}


	// get set retornando
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public double getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(double kmRodados) {
		this.kmRodados = kmRodados;
	}
}
