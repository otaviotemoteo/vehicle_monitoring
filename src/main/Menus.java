package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menus {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void exibirMenuPrincipal() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1. Visualizar Classes");
        System.out.println("2. Alterar Classes");
        System.out.println("3. Operar Classes");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void menuVisualizarClasses() {
        while (true) {
            System.out.println("\n=== VISUALIZAR CLASSES ===");
            System.out.println("1. Ver informações do Carro");
            System.out.println("2. Ver informações do Drone");
            System.out.println("0. Voltar ao menu principal");

            int opcao;
            while(true) {
                System.out.print("Escolha uma opção: ");
                try {
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido! Digite um número de 0 a 2.");
                    scanner.nextLine();
                }
            }

            switch (opcao) {
                case 1:
                    Views.visualizarCarro(Instances.getCarro());
                    break;
                case 2:
                    Views.visualizarDrone(Instances.getDrone());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void menuAlterarClasses() {
        while (true) {
            System.out.println("\n=== ALTERAR CLASSES ===");
            System.out.println("1. Alterar Carro");
            System.out.println("2. Alterar Drone");
            System.out.println("0. Voltar ao menu principal");

            int opcao;
            while(true) {
                System.out.print("Escolha uma opção: ");
                try {
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido! Digite um número de 0 a 2.");
                    scanner.nextLine();
                }
            }

            switch (opcao) {
                case 1:
                    Changes.alterarCarro(Instances.getCarro());
                    break;
                case 2:
                    Changes.alterarDrone(Instances.getDrone());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void menuOperarClasses() {
        while (true) {
            System.out.println("\n=== OPERAR CLASSES ===");
            System.out.println("1. Operar Carro");
            System.out.println("2. Operar Drone");
            System.out.println("0. Voltar ao menu principal");

            int opcao;
            while(true) {
                System.out.print("Escolha uma opção: ");
                try {
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido! Digite um número de 0 a 2.");
                    scanner.nextLine();
                }
            }

            switch (opcao) {
                case 1:
                    Operations.operarCarro(Instances.getCarro());
                    break;
                case 2:
                    Operations.operarDrone(Instances.getDrone());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}