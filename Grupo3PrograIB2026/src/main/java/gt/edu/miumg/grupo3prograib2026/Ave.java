/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.grupo3prograib2026;

/**
 * Clase Ave que hereda de Animal
 * @author Jackeline
 */
public class Ave extends Animal {
    private double envergaduraAlas;
    private boolean puedeVolar;
    
    public Ave(String nombre, int edad, double peso, double envergaduraAlas, boolean puedeVolar) {
        super(nombre, edad, peso);
        this.envergaduraAlas = envergaduraAlas;
        this.puedeVolar = puedeVolar;
    }
    
    // Agregado: constructor que tambien recibe el consumo diario
    public Ave(String nombre, int edad, double peso, double envergaduraAlas, boolean puedeVolar, double consumoDiario) {
        super(nombre, edad, peso, consumoDiario);
        this.envergaduraAlas = envergaduraAlas;
        this.puedeVolar = puedeVolar;
    }
    
    public Ave() {
        super();
        this.envergaduraAlas = 0.0;
        this.puedeVolar = true;
    }
    
    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }
    
    public void setEnvergaduraAlas(double envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }
    
    public boolean isPuedeVolar() {
        return puedeVolar;
    }
    
    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
    
    public void mostrarInfo() {
        System.out.println("=== DATOS DEL AVE ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Envergadura de alas: " + envergaduraAlas + " cm");
        System.out.println("Puede volar?: " + (puedeVolar ? "Si" : "No"));
        // Agregado: muestra el consumo diario si esta definido
        if (getConsumoDiario() > 0) {
            System.out.println("Consumo diario: " + getConsumoDiario() + " libras/dia");
        }
        System.out.println("---------------------");
    }
}