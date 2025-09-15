package main;

import java.util.Scanner;
import entities.fuel.Car;
import entities.eletric.Drone;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    
    // Instanciação dos objetos
    private static Car carro;
    private static Drone drone;
    
    public static void main(String[] args) {
        inicializarObjetos();
        
        System.out.println("=== SISTEMA DE GERENCIAMENTO DE VEÍCULOS ===");
        
        while (true) {
            exibirMenuPrincipal();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    menuVisualizarClasses();
                    break;
                case 2:
                    menuAlterarClasses();
                    break;
                case 3:
                    menuOperarClasses();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
    
    private static void inicializarObjetos() {
        System.out.println("Inicializando objetos...");
        
        // Instanciando Carro
        carro = new Car("Civic", "Honda", "ABC1234", 12.5, 50.0);
        
        // Instanciando Drone
        drone = new Drone("Phantom", "DJI", "DRN5678", 15.2, 30.0, 500.0, 25.0);
        
        System.out.println("Objetos inicializados com sucesso!\n");
        System.out.println("Carro: " + carro.toString());
        System.out.println("Drone: " + drone.toString());
    }
    
    private static void exibirMenuPrincipal() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1. Visualizar Classes");
        System.out.println("2. Alterar Classes");
        System.out.println("3. Operar Classes");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static void menuVisualizarClasses() {
        while (true) {
            System.out.println("\n=== VISUALIZAR CLASSES ===");
            System.out.println("1. Ver informações do Carro");
            System.out.println("2. Ver informações do Drone");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    visualizarCarro();
                    break;
                case 2:
                    visualizarDrone();
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
    
    private static void visualizarCarro() {
        System.out.println("\n--- INFORMAÇÕES DO CARRO ---");
        System.out.println(carro.toString());
        System.out.println("Nível de Combustível: " + carro.getNivelCombustivel() + " L");
        System.out.println("Capacidade do Tanque: " + carro.getCapacidadeTanque() + " L");
        System.out.println("Consumo Médio: " + carro.getConsumoMedio() + " km/L");
        System.out.println("Autonomia: " + carro.calcularAutonomia() + " km");
        System.out.println("Nível de Óleo: " + carro.getNivelOleo() + "%");
        System.out.println("Status dos Pneus: " + carro.verificarPneus());
        System.out.println("Desgaste dos Pneus: " + carro.calcularDesgastePneus() + "%");
        System.out.println("Próxima Manutenção: " + carro.getKmProximaManutencao() + " km");
    }
    
    private static void visualizarDrone() {
        System.out.println("\n--- INFORMAÇÕES DO DRONE ---");
        System.out.println(drone.toString());
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
    
    private static void menuAlterarClasses() {
        while (true) {
            System.out.println("\n=== ALTERAR CLASSES ===");
            System.out.println("1. Alterar Carro");
            System.out.println("2. Alterar Drone");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    alterarCarro();
                    break;
                case 2:
                    alterarDrone();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    private static void alterarCarro() {
        while (true) {
            System.out.println("\n--- ALTERAR CARRO ---");
            System.out.println("1. Alterar modelo");
            System.out.println("2. Alterar marca");
            System.out.println("3. Alterar chassi");
            System.out.println("4. Alterar velocidade atual");
            System.out.println("5. Alterar nível de combustível");
            System.out.println("6. Alterar consumo médio");
            System.out.println("7. Alterar nível de óleo");
            System.out.println("8. Alterar status dos pneus");
            System.out.println("9. Alterar km próxima manutenção");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Novo modelo: ");
                    carro.setModelo(scanner.nextLine());
                    System.out.println("Modelo alterado!");
                    break;
                case 2:
                    System.out.print("Nova marca: ");
                    carro.setMarca(scanner.nextLine());
                    System.out.println("Marca alterada!");
                    break;
                case 3:
                    System.out.print("Novo chassi: ");
                    carro.setChassi(scanner.nextLine());
                    System.out.println("Chassi alterado!");
                    break;
                case 4:
                    System.out.print("Nova velocidade atual (km/h): ");
                    carro.setVelocidadeAtual(scanner.nextDouble());
                    System.out.println("Velocidade alterada!");
                    break;
                case 5:
                    System.out.print("Novo nível de combustível (L): ");
                    carro.setNivelCombustivel(scanner.nextDouble());
                    System.out.println("Nível de combustível alterado!");
                    break;
                case 6:
                    System.out.print("Novo consumo médio (km/L): ");
                    carro.setConsumoMedio(scanner.nextDouble());
                    System.out.println("Consumo médio alterado!");
                    break;
                case 7:
                    System.out.print("Novo nível de óleo (%): ");
                    carro.setNivelOleo(scanner.nextDouble());
                    System.out.println("Nível de óleo alterado!");
                    break;
                case 8:
                    System.out.print("Novo status dos pneus: ");
                    carro.setStatusPneu(scanner.nextLine());
                    System.out.println("Status dos pneus alterado!");
                    break;
                case 9:
                    System.out.print("Novo km para próxima manutenção: ");
                    carro.setKmProximaManutencao(scanner.nextInt());
                    System.out.println("Km para manutenção alterado!");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    private static void alterarDrone() {
        while (true) {
            System.out.println("\n--- ALTERAR DRONE ---");
            System.out.println("1. Alterar modelo");
            System.out.println("2. Alterar marca");
            System.out.println("3. Alterar chassi");
            System.out.println("4. Alterar velocidade atual");
            System.out.println("5. Alterar nível da bateria");
            System.out.println("6. Alterar capacidade média");
            System.out.println("7. Alterar autonomia");
            System.out.println("8. Alterar altitude máxima");
            System.out.println("9. Alterar tempo de voo");
            System.out.println("10. Alterar altitude atual");
            System.out.println("11. Alterar status do voo");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Novo modelo: ");
                    drone.setModelo(scanner.nextLine());
                    System.out.println("Modelo alterado!");
                    break;
                case 2:
                    System.out.print("Nova marca: ");
                    drone.setMarca(scanner.nextLine());
                    System.out.println("Marca alterada!");
                    break;
                case 3:
                    System.out.print("Novo chassi: ");
                    drone.setChassi(scanner.nextLine());
                    System.out.println("Chassi alterado!");
                    break;
                case 4:
                    System.out.print("Nova velocidade atual (km/h): ");
                    drone.setVelocidadeAtual(scanner.nextDouble());
                    System.out.println("Velocidade alterada!");
                    break;
                case 5:
                    System.out.print("Novo nível da bateria (%): ");
                    drone.setNivelBateria(scanner.nextDouble());
                    System.out.println("Nível da bateria alterado!");
                    break;
                case 6:
                    System.out.print("Nova capacidade média (kWh): ");
                    drone.setCapacidadeMedia(scanner.nextDouble());
                    System.out.println("Capacidade média alterada!");
                    break;
                case 7:
                    System.out.print("Nova autonomia (km): ");
                    drone.setAutonomia(scanner.nextDouble());
                    System.out.println("Autonomia alterada!");
                    break;
                case 8:
                    System.out.print("Nova altitude máxima (m): ");
                    drone.setAltitudeMax(scanner.nextDouble());
                    System.out.println("Altitude máxima alterada!");
                    break;
                case 9:
                    System.out.print("Novo tempo de voo (min): ");
                    drone.setTempoVoo(scanner.nextDouble());
                    System.out.println("Tempo de voo alterado!");
                    break;
                case 10:
                    System.out.print("Nova altitude atual (m): ");
                    drone.setAltitudeAtual(scanner.nextDouble());
                    System.out.println("Altitude atual alterada!");
                    break;
                case 11:
                    System.out.print("Novo status do voo: ");
                    drone.setStatusVoo(scanner.nextLine());
                    System.out.println("Status do voo alterado!");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    private static void menuOperarClasses() {
        while (true) {
            System.out.println("\n=== OPERAR CLASSES ===");
            System.out.println("1. Operar Carro");
            System.out.println("2. Operar Drone");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    operarCarro();
                    break;
                case 2:
                    operarDrone();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    private static void operarCarro() {
        while (true) {
            System.out.println("\n--- OPERAR CARRO ---");
            System.out.println("1. Acelerar");
            System.out.println("2. Registrar viagem");
            System.out.println("3. Abastecer");
            System.out.println("4. Trocar óleo");
            System.out.println("5. Verificar pneus");
            System.out.println("6. Agendar manutenção");
            System.out.println("7. Calcular autonomia");
            System.out.println("8. Atualizar consumo");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Velocidade para acelerar (km/h): ");
                    double velocidade = scanner.nextDouble();
                    carro.acelerar(velocidade);
                    break;
                case 2:
                    System.out.print("Distância da viagem (km): ");
                    double km = scanner.nextDouble();
                    carro.registrarViagem(km);
                    break;
                case 3:
                    System.out.print("Litros para abastecer: ");
                    double litros = scanner.nextDouble();
                    carro.abastecer(litros);
                    break;
                case 4:
                    carro.trocarOleo();
                    break;
                case 5:
                    System.out.println("Status dos pneus: " + carro.verificarPneus());
                    System.out.println("Desgaste: " + carro.calcularDesgastePneus() + "%");
                    break;
                case 6:
                    carro.agendarManutencao();
                    break;
                case 7:
                    System.out.println("Autonomia atual: " + carro.calcularAutonomia() + " km");
                    break;
                case 8:
                    System.out.print("Distância percorrida (km): ");
                    double distancia = scanner.nextDouble();
                    carro.atualizarConsumo(distancia);
                    System.out.println("Consumo atualizado!");
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
    
    private static void operarDrone() {
        while (true) {
            System.out.println("\n--- OPERAR DRONE ---");
            System.out.println("1. Acelerar");
            System.out.println("2. Registrar viagem");
            System.out.println("3. Decolar");
            System.out.println("4. Pousar");
            System.out.println("5. Recarregar bateria");
            System.out.println("6. Calcular autonomia");
            System.out.println("7. Calcular tempo de voo restante");
            System.out.println("8. Agendar manutenção");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Velocidade para acelerar (km/h): ");
                    double velocidade = scanner.nextDouble();
                    drone.acelerar(velocidade);
                    break;
                case 2:
                    System.out.print("Distância da viagem (km): ");
                    double km = scanner.nextDouble();
                    drone.registrarViagem(km);
                    break;
                case 3:
                    drone.decolar();
                    break;
                case 4:
                    drone.pousar();
                    break;
                case 5:
                    System.out.print("Percentual para recarregar (%): ");
                    double percentual = scanner.nextDouble();
                    drone.recarregar(percentual);
                    break;
                case 6:
                    System.out.println("Autonomia atual: " + drone.calcularAutonomia() + " km");
                    break;
                case 7:
                    System.out.println("Tempo de voo restante: " + drone.calcularTempoVooRestante() + " min");
                    break;
                case 8:
                    drone.agendarManutencao();
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
}