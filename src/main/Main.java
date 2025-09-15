package main;

import java.util.Scanner;
import entities.*;
import entities.fuel.Car;
import entities.eletric.Drone;
import entities.eletric.ElectricVehicle;
import entities.fuel.FuelVehicle;

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
        // Instanciando apenas Carro e Drone
        System.out.println("Inicializando objetos...");
        
        // TODO: Instanciar objetos com base nos construtores das suas classes
        // carro = new Car(...);
        // drone = new Drone(...);
        
        System.out.println("Objetos inicializados com sucesso!\n");
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
                    System.out.println("\n--- INFORMAÇÕES DO CARRO ---");
                    // TODO: Exibir informações do carro
                    break;
                case 2:
                    System.out.println("\n--- INFORMAÇÕES DO DRONE ---");
                    // TODO: Exibir informações do drone
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
    
    private static void menuAlterarClasses() {
        while (true) {
            System.out.println("\n=== ALTERAR CLASSES ===");
            System.out.println("1. Alterar Carro");
            System.out.println("2. Alterar Drone");
            System.out.println("3. Alterar Veículo Elétrico");
            System.out.println("4. Alterar Veículo a Combustível");
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
                case 3:
                    alterarVeiculoEletrico();
                    break;
                case 4:
                    alterarVeiculoCombustivel();
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
            System.out.println("3. Operar Veículo Elétrico");
            System.out.println("4. Operar Veículo a Combustível");
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
                case 3:
                    operarVeiculoEletrico();
                    break;
                case 4:
                    operarVeiculoCombustivel();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }