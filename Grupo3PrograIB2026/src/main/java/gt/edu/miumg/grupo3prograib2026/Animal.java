/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.grupo3prograib2026;

/**
 * Clase base Animal
 * @author Jackeline
 */
public class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private double consumoDiario;  // Agregado: cantidad de libras que consume por dia
    
    public Animal() {
    }
    
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    // Agregado: constructor que incluye el consumo diario
    public Animal(String nombre, int edad, double peso, double consumoDiario) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.consumoDiario = consumoDiario;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    // Agregado: getter y setter para el consumo diario
    public double getConsumoDiario() {
        return consumoDiario;
    }
    
    public void setConsumoDiario(double consumoDiario) {
        this.consumoDiario = consumoDiario;
    }
    
    /**
     * Metodo recursivo para calcular el consumo total en un numero de dias
     * Caso base: si dias es 0 o menos, retorna 0
     * Caso recursivo: suma el consumo de hoy mas el consumo de los dias restantes
     */
    public double calcularConsumoRecursivo(int dias) {
        if (dias <= 0) {
            return 0;
        }
        return consumoDiario + calcularConsumoRecursivo(dias - 1);
    }
    
    // Metodo recursivo con traza para ver paso a paso como se va calculando
    public double calcularConsumoRecursivoConTraza(int dias) {
        System.out.println("Llamada recursiva con dias = " + dias);
        if (dias <= 0) {
            System.out.println("  -> Caso base alcanzado, retorna 0");
            return 0;
        }
        double resultado = consumoDiario + calcularConsumoRecursivoConTraza(dias - 1);
        System.out.println("  -> Retorna " + consumoDiario + " + consumo(" + (dias - 1) + ") = " + resultado);
        return resultado;
    }
}