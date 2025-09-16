
package main;

import java.util.Scanner;
import entities.fuel.Car;
import entities.eletric.Drone;

public class Operations {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void operarCarro(Car carro) {
        while (true) {
            System.out.println("\n--- OPERAR CARRO ---");
            System.out.println("Status: " + (carro.isAtivo() ? "LIGADO" : "DESLIGADO"));
            System.out.println("1. Ligar");
            System.out.println("2. Desligar");
            System.out.println("3. Registrar viagem");
            System.out.println("4. Abastecer");
            System.out.println("5. Trocar óleo");
            System.out.println("6. Verificar pneus");
            System.out.println("7. Fazer manutenção");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    ligarCarro(carro);
                    break;
                case 2:
                    desligarCarro(carro);
                    break;
                case 3:
                    registrarViagemCarro(carro);
                    break;
                case 4:
                    abastecerCarro(carro);
                    break;
                case 5:
                    trocarOleoCarro(carro);
                    break;
                case 6:
                    verificarPneusCarro(carro);
                    break;
                case 7:
                    fazerManutencaoCarro(carro);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
            
            System.out.println("\nPressione Enter para continuar...");
            scanner.nextLine();
        }
    }
    
    public static void operarDrone(Drone drone) {
        while (true) {
            System.out.println("\n--- OPERAR DRONE ---");
            System.out.println("Status: " + (drone.isAtivo() ? "LIGADO" : "DESLIGADO"));
            System.out.println("1. Ligar");
            System.out.println("2. Desligar");
            System.out.println("3. Decolar");
            System.out.println("4. Pousar");
            System.out.println("5. Registrar viagem");
            System.out.println("6. Recarregar bateria");
            System.out.println("7. Calcular tempo de voo restante");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    ligarDrone(drone);
                    break;
                case 2:
                    desligarDrone(drone);
                    break;
                case 3:
                	decolarDrone(drone);
                    break;
                case 4:
                	pousarDrone(drone);
                    break;
                case 5:
                	registrarViagemDrone(drone);
                    break;
                case 6:
                	recarregarBateriaDrone(drone);
                    break;
                case 7:
                	Views.exibirTempoVooRestante(drone);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
            
            System.out.println("\nPressione Enter para continuar...");
            scanner.nextLine();
        }
    }
    
    // === OPERAÇÕES DO CARRO ===
    private static void ligarCarro(Car carro) {
        carro.ligar();
    }
    
    private static void desligarCarro(Car carro) {
        carro.desligar();
    }
    
    private static void registrarViagemCarro(Car carro) {
        if (carro.isAtivo()) {
            System.out.print("Distância da viagem (km): ");
            double km = scanner.nextDouble();
            carro.registrarViagem(km);
            // Atualiza consumo automaticamente após a viagem
            carro.atualizarConsumo(km);
            // Simula desgaste dos componentes
            carro.setDesgastePneus(carro.getDesgastePneus() + (km * 0.01)); // 0.01% por km
            carro.setNivelOleo(carro.getNivelOleo() - (km * 0.02)); // 0.02% por km
            
            // Atualiza status dos pneus baseado no desgaste
            if (carro.getDesgastePneus() > 70) {
                carro.setStatusPneu("Ruim - Precisa trocar");
            } else if (carro.getDesgastePneus() > 50) {
                carro.setStatusPneu("Regular");
            }
            
            System.out.println("Desgaste e consumo atualizados automaticamente!");
        } else {
            System.out.println("ERRO: O carro precisa estar ligado para registrar viagem!");
        }
    }
    
    private static void abastecerCarro(Car carro) {
        if (!carro.isAtivo()) {
            System.out.print("Litros para abastecer: ");
            double litros = scanner.nextDouble();
            carro.abastecer(litros);
            System.out.println("Carro abastecido com sucesso!");
        } else {
            System.out.println("ERRO: O carro precisa estar desligado para abastecer!");
        }
    }
    
    private static void trocarOleoCarro(Car carro) {
        if (!carro.isAtivo()) {
            carro.trocarOleo();
            System.out.println("Oléo do carro trocado com sucesso!");
        } else {
            System.out.println("ERRO: O carro precisa estar desligado para trocar óleo!");
        }
    }
    
    private static void verificarPneusCarro(Car carro) {
        if (!carro.isAtivo()) {
            Views.exibirStatusPneus(carro);
        } else {
            System.out.println("ERRO: O carro precisa estar desligado para verificar pneus!");
        }
    }
    
    private static void fazerManutencaoCarro(Car carro) {
        if (!carro.isAtivo()) {
            carro.fazerManutencao();
        } else {
            System.out.println("ERRO: O carro precisa estar desligado para fazer manutenção!");
        }
    }
    
    // === OPERAÇÕES DO DRONE ===
    private static void ligarDrone(Drone drone) {
        drone.ligar();
    }
    
    private static void desligarDrone(Drone drone) {
        drone.desligar();
    }
    
    
    private static void decolarDrone(Drone drone) {
        drone.decolar();
    }
    
    private static void pousarDrone(Drone drone) {
        drone.pousar();
    }
    
    private static void registrarViagemDrone(Drone drone) {
        if (drone.isAtivo() && drone.getStatusVoo().equals("Em voo")) {
            System.out.print("Distância da viagem (km): ");
            double km = scanner.nextDouble();
            drone.registrarViagem(km);
            // Simula consumo de bateria baseado na distância
            double consumoBateria = km * 0.5; // 0.5% por km
            double novoBateria = drone.getNivelBateria() - consumoBateria;
            if (novoBateria < 0) novoBateria = 0;
            drone.setNivelBateria(novoBateria);
            
            System.out.println("Bateria consumida: " + String.format("%.2f", consumoBateria) + "%");
            System.out.println("Nível atual da bateria: " + String.format("%.1f", drone.getNivelBateria()) + "%");
            
            // Aviso se bateria estiver baixa
            if (drone.getNivelBateria() < 20) {
                System.out.println("⚠️  ATENÇÃO: Bateria baixa! Considere pousar e recarregar.");
            }
        } else if (!drone.isAtivo()) {
            System.out.println("ERRO: O drone precisa estar ligado para registrar viagem!");
        } else {
            System.out.println("ERRO: O drone precisa estar em voo para registrar viagem!");
        }
    }
    
    private static void recarregarBateriaDrone(Drone drone) {
        drone.recarregarBateria(); // Usa o método da classe Drone que já valida se está desligado e pousado
    }
}