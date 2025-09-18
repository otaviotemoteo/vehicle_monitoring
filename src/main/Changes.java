package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.eletric.Drone;
import entities.fuel.Car;

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

            int opcao;

            while(true) {
                System.out.print("Escolha uma opção: ");
                try {
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido! Digite um número de 0 a 4.");
                    scanner.nextLine();
                }
            }

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
                    double novoConsumo;
                    while(true) {
                        System.out.print("Novo consumo médio (km/L): ");
                        try {
                            novoConsumo = scanner.nextDouble();
                            scanner.nextLine();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Valor inválido! Digite um número válido para o consumo.");
                            scanner.nextLine();
                        }
                    }
                    carro.setConsumoMedio(novoConsumo);
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

            int opcao;

            while(true) {
                System.out.print("Escolha uma opção: ");
                try {
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido! Digite um número de 0 a 4.");
                    scanner.nextLine();
                }
            }

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
                    double novaCapacidade;
                    while(true) {
                        System.out.print("Nova capacidade média (kWh): ");
                        try {
                            novaCapacidade = scanner.nextDouble();
                            scanner.nextLine();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Valor inválido! Digite um número válido para a capacidade.");
                            scanner.nextLine(); // limpa o buffer
                        }
                    }
                    drone.setCapacidadeMedia(novaCapacidade);
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