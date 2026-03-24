/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gt.edu.miumg.grupo3prograib2026;

/**
 * Clase principal para probar la herencia
 * @author Jackeline
 */
public class Grupo3PrograIB2026 {
    
    public static void main(String[] args) {
        
        System.out.println("=== DEMOSTRACIÓN DE HERENCIA ===\n");
        
        Mamifero perro = new Mamifero("Firulais", 3, 15.5, "Pelo corto", 4);
        Ave aguila = new Ave("Águila Real", 5, 6.2, 180.0, true);
        Reptil serpiente = new Reptil("Cascabel", 2, 3.8, "Escamas en anillos", true);
        
        perro.mostrarInfo();
        System.out.println();
        aguila.mostrarInfo();
        System.out.println();
        serpiente.mostrarInfo();
        
        System.out.println("\n=== CREANDO OBJETOS CON CONSTRUCTOR VACÍO ===\n");
        
        Mamifero mamiferoGenerico = new Mamifero();
        mamiferoGenerico.setNombre("Animal Genérico");
        mamiferoGenerico.setEdad(1);
        mamiferoGenerico.setPeso(10.0);
        mamiferoGenerico.setTipoPelaje("Pelaje estándar");
        mamiferoGenerico.setNumeroPatas(4);
        mamiferoGenerico.mostrarInfo();
        
        System.out.println("\n=== MODIFICANDO DATOS CON SETTERS ===\n");
        
        perro.setEdad(4);
        perro.setPeso(16.8);
        System.out.println("Después de modificar:");
        perro.mostrarInfo();
    }
    
}

