/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.grupo3prograib2026;

/**
 * Clase Mamifero que hereda de Animal
 * @author Jackeline
 */
public class Mamifero extends Animal {
    private String tipoPelaje;
    private int numeroPatas;
    
    public Mamifero(String nombre, int edad, double peso, String tipoPelaje, int numeroPatas) {
        super(nombre, edad, peso);
        this.tipoPelaje = tipoPelaje;
        this.numeroPatas = numeroPatas;
    }
    
    public Mamifero() {
        super();
        this.tipoPelaje = "Desconocido";
        this.numeroPatas = 4;
    }
    
    public String getTipoPelaje() {
        return tipoPelaje;
    }
    
    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }
    
    public int getNumeroPatas() {
        return numeroPatas;
    }
    
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    public void mostrarInfo() {
        System.out.println("=== DATOS DEL MAMÍFERO ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Tipo de pelaje: " + tipoPelaje);
        System.out.println("Número de patas: " + numeroPatas);
        System.out.println("--------------------------");
    }
}