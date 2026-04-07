package gt.edu.miumg.grupo3prograib2026;

import java.util.ArrayList;
import java.util.List;

public class Grupo3PrograIB2026 {
    public static void main(String[] args) {
        Mamifero perro = new Mamifero("Firulais", 3, 15.5, "Pelo corto", 4);
        Ave aguila = new Ave("Aguila Real", 5, 6.2, 180.0, true);
        Reptil serpiente = new Reptil("Cascabel", 2, 3.8, "Escamas en anillos", true);

        perro.setConsumoDiario(2.5);
        aguila.setConsumoDiario(1.2);
        serpiente.setConsumoDiario(0.8);

        List<Animal> animales = new ArrayList<>();
        animales.add(perro);
        animales.add(aguila);
        animales.add(serpiente);

        for (Animal a : animales) {
            a.mostrarInfo();
            System.out.println("Sonido: " + a.emitirSonido());
            System.out.println("Movimiento: " + a.moverse());
            System.out.println("Alimentacion: " + a.alimentarse());
            System.out.println();
        }
    }
}