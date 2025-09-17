
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
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    System.out.print("Distância da viagem (km): ");
                    double km = scanner.nextDouble();
                    carro.registrarViagemCompleta(km);
                    break;
                case 4:
                    System.out.print("Litros para abastecer: ");
                    double litros = scanner.nextDouble();
                    carro.abastecerCompleto(litros);
                    break;
                case 5:
                    carro.trocarOleoCompleto();
                    break;
                case 6:
                    carro.verificarPneusCompleto();
                    break;
                case 7:
                    carro.fazerManutencaoCompleta();
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
                	drone.ligar();
                    break;
                case 2:
                	drone.desligar();
                    break;
                case 3:
                	drone.decolar();
                    break;
                case 4:
                	drone.pousar();
                    break;
                case 5:
                    System.out.print("Distância da viagem (km): ");
                    double km = scanner.nextDouble();
                    drone.registrarViagem(km);
                    break;
                case 6:
                    drone.recarregarBateria();
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
}