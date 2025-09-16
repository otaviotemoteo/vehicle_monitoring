package main;

import java.util.Scanner;
import entities.fuel.Car;
import entities.eletric.Drone;

public class Changes {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void alterarCarro(Car carro) {
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
            System.out.println("9. Alterar desgaste dos pneus");
            System.out.println("10. Alterar km próxima manutenção");
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
                    System.out.print("Novo desgaste dos pneus (%): ");
                    carro.setDesgastePneus(scanner.nextDouble());
                    System.out.println("Desgaste dos pneus alterado!");
                    break;
                case 10:
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
    
    public static void alterarDrone(Drone drone) {
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
}