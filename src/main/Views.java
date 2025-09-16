
package main;

import entities.fuel.Car;
import entities.eletric.Drone;

public class Views {
    
    public static void visualizarCarro(Car carro) {
        System.out.println("\n--- INFORMAÇÕES DO CARRO ---");
        System.out.println(carro.toString());
        System.out.println("Status: " + (carro.isAtivo() ? "LIGADO" : "DESLIGADO"));
        System.out.println("Nível de Combustível: " + String.format("%.2f", carro.getNivelCombustivel()) + " L");
        System.out.println("Capacidade do Tanque: " + carro.getCapacidadeTanque() + " L");
        System.out.println("Consumo Médio: " + carro.getConsumoMedio() + " km/L");
        System.out.println("Autonomia: " + String.format("%.2f", carro.calcularAutonomia()) + " km");
        System.out.println("Nível de Óleo: " + String.format("%.2f", carro.getNivelOleo()) + "%");
        System.out.println("Status dos Pneus: " + carro.verificarPneus());
        System.out.println("Desgaste dos Pneus: " + String.format("%.2f", carro.calcularDesgastePneus()) + "%");
        System.out.println("Próxima Manutenção: " + carro.getKmProximaManutencao() + " km");
    }
    
    public static void visualizarDrone(Drone drone) {
        System.out.println("\n--- INFORMAÇÕES DO DRONE ---");
        System.out.println(drone.toString());
        System.out.println("Status: " + (drone.isAtivo() ? "LIGADO" : "DESLIGADO"));
        System.out.println("Capacidade da Bateria: " + drone.getCapacidadeMedia() + " kWh");
        System.out.println("Nível da Bateria: " + drone.getNivelBateria() + "%");
        System.out.println("Autonomia: " + drone.calcularAutonomia() + " km");
        System.out.println("Altitude Máxima: " + drone.getAltitudeMax() + " m");
        System.out.println("Altitude Atual: " + drone.getAltitudeAtual() + " m");
        System.out.println("Tempo de Voo: " + drone.getTempoVoo() + " min");
        System.out.println("Tempo de Voo Restante: " + drone.calcularTempoVooRestante() + " min");
        System.out.println("Status do Voo: " + drone.getStatusVoo());
        System.out.println("Ciclos de Recarga: " + drone.getCiclosRecarga());
    }
    
    public static void exibirInformacoesCombustivel(Car carro) {
        System.out.println("=== INFORMAÇÕES DE COMBUSTÍVEL ===");
        System.out.println("Nível atual: " + String.format("%.2f", carro.getNivelCombustivel()) + " L");
        System.out.println("Capacidade total: " + carro.getCapacidadeTanque() + " L");
        System.out.println("Autonomia atual: " + String.format("%.2f", carro.calcularAutonomia()) + " km");
        System.out.println("Consumo médio: " + carro.getConsumoMedio() + " km/L");
    }
    
    public static void exibirStatusPneus(Car carro) {
        System.out.println("Status dos pneus: " + carro.verificarPneus());
        System.out.println("Desgaste: " + String.format("%.2f", carro.calcularDesgastePneus()) + "%");
    }
    
    public static void exibirTempoVooRestante(Drone drone) {
        System.out.println("Tempo de voo restante: " + drone.calcularTempoVooRestante() + " min");
    }
}