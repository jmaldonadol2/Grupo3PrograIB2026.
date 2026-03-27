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
        
        System.out.println("=== DEMOSTRACION DE HERENCIA ===\n");
        
        Mamifero perro = new Mamifero("Firulais", 3, 15.5, "Pelo corto", 4);
        Ave aguila = new Ave("Aguila Real", 5, 6.2, 180.0, true);
        Reptil serpiente = new Reptil("Cascabel", 2, 3.8, "Escamas en anillos", true);
        
        // Asignamos el consumo diario de cada animal usando los setters
        perro.setConsumoDiario(2.5);
        aguila.setConsumoDiario(1.2);
        serpiente.setConsumoDiario(0.8);
        
        perro.mostrarInfo();
        System.out.println();
        aguila.mostrarInfo();
        System.out.println();
        serpiente.mostrarInfo();
        
        System.out.println("\n=== DEMOSTRACION DE RECURSIVIDAD ===\n");
        
        int dias = 5;
        
        System.out.println("Calculo de consumo total en " + dias + " dias:");
        System.out.println("---------------------------------------------");
        
        double consumoPerro = perro.calcularConsumoRecursivo(dias);
        System.out.println(perro.getNombre() + " consume " + consumoPerro + " libras en " + dias + " dias");
        
        double consumoAguila = aguila.calcularConsumoRecursivo(dias);
        System.out.println(aguila.getNombre() + " consume " + consumoAguila + " libras en " + dias + " dias");
        
        double consumoSerpiente = serpiente.calcularConsumoRecursivo(dias);
        System.out.println(serpiente.getNombre() + " consume " + consumoSerpiente + " libras en " + dias + " dias");
        
        System.out.println("\n=== RECURSIVIDAD PASO A PASO ===\n");
        
        System.out.println("Trazando el calculo recursivo para " + perro.getNombre() + ":");
        System.out.println("------------------------------------------------");
        perro.calcularConsumoRecursivoConTraza(dias);
        
        System.out.println("\n=== CREANDO OBJETOS CON CONSTRUCTOR VACIO ===\n");
        
        Mamifero mamiferoGenerico = new Mamifero();
        mamiferoGenerico.setNombre("Animal Generico");
        mamiferoGenerico.setEdad(1);
        mamiferoGenerico.setPeso(10.0);
        mamiferoGenerico.setTipoPelaje("Pelaje estandar");
        mamiferoGenerico.setNumeroPatas(4);
        mamiferoGenerico.setConsumoDiario(1.5);
        mamiferoGenerico.mostrarInfo();
        
        System.out.println("\n=== MODIFICANDO DATOS CON SETTERS ===\n");
        
        perro.setEdad(4);
        perro.setPeso(16.8);
        System.out.println("Despues de modificar:");
        perro.mostrarInfo();
        
        System.out.println("\n=== CALCULO CON NUEVOS DIAS ===\n");
        System.out.println(perro.getNombre() + " consume " + 
                           perro.calcularConsumoRecursivo(7) + " libras en 7 dias");
    }
}
