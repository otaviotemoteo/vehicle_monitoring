package main;

import entities.fuel.Car;
import entities.eletric.Drone;

public class Instances {
    private static Car carro;
    private static Drone drone;
    
    public static void inicializarObjetos() {
        System.out.println("Inicializando objetos...");
        
        // Instanciando Carro
        carro = new Car("Civic", "Honda", "ABC1234", 12.5, 50.0);
        
        // Instanciando Drone
        drone = new Drone("Phantom", "DJI", "DRN5678", 15.2, 30.0, 500.0, 25.0);
        
        System.out.println("Objetos inicializados com sucesso!\n");
        System.out.println("Carro: " + carro.toString());
        System.out.println("Drone: " + drone.toString());
    }
    
    public static Car getCarro() {
        return carro;
    }
    
    public static Drone getDrone() {
        return drone;
    }
    
    public static void setCarro(Car carro) {
        Instances.carro = carro;
    }
    
    public static void setDrone(Drone drone) {
        Instances.drone = drone;
    }
}