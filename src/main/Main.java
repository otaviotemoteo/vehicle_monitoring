package main;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Inicializar objetos
        Instances.inicializarObjetos();
        
        System.out.println("=== SISTEMA DE GERENCIAMENTO DE VEÍCULOS ===");
        
        // Loop principal do sistema
        while (true) {
            Menus.exibirMenuPrincipal();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    Menus.menuVisualizarClasses();
                    break;
                case 2:
                    Menus.menuAlterarClasses();
                    break;
                case 3:
                    Menus.menuOperarClasses();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    System.out.println("Obrigado por usar o Sistema de Gerenciamento de Veículos!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}