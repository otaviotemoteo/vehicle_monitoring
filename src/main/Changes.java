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
            System.out.println("4. Alterar consumo médio");
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
                	System.out.print("Novo consumo médio (km/L): ");
                    carro.setConsumoMedio(scanner.nextDouble());
                    System.out.println("Consumo médio alterado!");
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
            System.out.println("4. Alterar capacidade média");
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
                	System.out.print("Nova capacidade média (kWh): ");
                    drone.setCapacidadeMedia(scanner.nextDouble());
                    System.out.println("Capacidade média alterada!");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}