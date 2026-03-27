/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.grupo3prograib2026;

/**
 * Clase Reptil que hereda de Animal
 * @author Jackeline
 */
public class Reptil extends Animal {
    private String tipoEscamas;
    private boolean esVenenoso;
    
    public Reptil(String nombre, int edad, double peso, String tipoEscamas, boolean esVenenoso) {
        super(nombre, edad, peso);
        this.tipoEscamas = tipoEscamas;
        this.esVenenoso = esVenenoso;
    }
    
    // Agregado: constructor que tambien recibe el consumo diario
    public Reptil(String nombre, int edad, double peso, String tipoEscamas, boolean esVenenoso, double consumoDiario) {
        super(nombre, edad, peso, consumoDiario);
        this.tipoEscamas = tipoEscamas;
        this.esVenenoso = esVenenoso;
    }
    
    public Reptil() {
        super();
        this.tipoEscamas = "Escamas pequeñas";
        this.esVenenoso = false;
    }
    
    public String getTipoEscamas() {
        return tipoEscamas;
    }
    
    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }
    
    public boolean isEsVenenoso() {
        return esVenenoso;
    }
    
    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }
    
    public void mostrarInfo() {
        System.out.println("=== DATOS DEL REPTIL ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Tipo de escamas: " + tipoEscamas);
        System.out.println("Es venenoso?: " + (esVenenoso ? "Si" : "No"));
        // Agregado: muestra el consumo diario si esta definido
        if (getConsumoDiario() > 0) {
            System.out.println("Consumo diario: " + getConsumoDiario() + " libras/dia");
        }
        System.out.println("------------------------");
    }
}