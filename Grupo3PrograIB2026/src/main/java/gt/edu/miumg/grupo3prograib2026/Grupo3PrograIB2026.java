package gt.edu.miumg.grupo3prograib2026;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Grupo3PrograIB2026 {

    private static Mamifero mamifero = null;
    private static Ave ave = null;
    private static Reptil reptil = null;
    private static Scanner scanner = new Scanner(System.in);
    private static Animal[] animales = new Animal[10];
    private static int totalAnimales = 0;
    
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = leerEntero("Seleccione una opcion: ");
            switch (opcion) {
                case 1:
                    menuZoo();
                    break;
                case 2:
                    menuArreglosyBusqueda();
                    break;
                case 3:
                    System.out.println("  [Fase III - En construccion]");
                    break;
                case 4:
                    System.out.println("  Gracias por usar el sistema del Zoologico La Aurora."
                        + "  Hasta pronto! Que tenga un excelente dia.");
                    
                    break;
                default:
                    System.out.println("  Opcion invalida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
 
    // --- MENU PRINCIPAL ---
    private static void mostrarMenuPrincipal() {
        System.out.println("|-----------------------------------|");
        System.out.println("|   ZOOLOGICO LA AURORA - SISTEMA   |");
        System.out.println("|-----------------------------------|");
        System.out.println("|  1. Zoo                           |");
        System.out.println("|  2. Fase II – Arreglos y Búsqueda |");
        System.out.println("|  3. Fase III                      |");
        System.out.println("|  4. Salir                         |");
        System.out.println("|-----------------------------------|");
    }
 
    // --- MENU ZOO ---
    private static void menuZoo() {
        int opcion;
        do {
            System.out.println("|-------------------------------------|");
            System.out.println("|             MENU - ZOO              |");
            System.out.println("|-------------------------------------|");
            System.out.println("|  1. Agregar nuevo animal            |");
            System.out.println("|  2. Ver todos los animales del Zoo  |");
            System.out.println("|  3. Alimentar animal                |");
            System.out.println("|  4. Exportar a CSV                  |");
            System.out.println("|  5. Volver al menu principal        |");
            System.out.println("|-------------------------------------|");
            opcion = leerEntero("Seleccione una opcion: ");
            switch (opcion) {
                case 1:
                    menuAgregarAnimal();
                    break;
                case 2:
                    verAnimales();
                    break;
                case 3:
                    menuAlimentar();
                    break;
                case 4:
                    exportarCSV();
                    break;
                case 5:
                    System.out.println("  Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("  Opcion invalida. Intente de nuevo.");
            }
        } while (opcion != 5); 
    }
  
    // Menú Arreglos y busqueda
    private static void menuArreglosyBusqueda(){
        char opcion;
        do {
            System.out.println("|---------------------------------------|");
            System.out.println("|     Fase 2 – Arreglos y Búsqueda      |");
            System.out.println("|---------------------------------------|");
            System.out.println("|  a. Agregar Mamífero                  |");
            System.out.println("|  b. Agregar Ave                       |");
            System.out.println("|  c. Agregar Reptil                    |");
            System.out.println("|  d. Buscar animal por identificador   |");
            System.out.println("|  e. Buscar animal por nombre          |");
            System.out.println("|  f. Ordenar arreglo por identificador |");
            System.out.println("|  g. Mostrar todos los animales        |");
            System.out.println("|  h. Mostrar estadísticas              |");
            System.out.println("|  i. Volver al menu principal          |");
            System.out.println("|---------------------------------------|");
            opcion = leerLetra("Seleccione una opcion: ");
            switch (opcion) {
                case 'a':
                    //a. Agregar Mamífero
                    break;
                case 'b':
                    //b. Agregar Ave 
                    break;
                case 'c':
                    //c. Agregar Reptil
                    break;
                case 'd':
                    //d. Buscar animal por identificador
                    break;
                case 'e':
                    //e. Buscar animal por nombre
                    break;
                case 'f':
                    //f. Ordenar arreglo por identificador
                    break;
                case 'g':
                    //g. Mostrar todos los animales
                    break;
                case 'h':
                    mostrarEstadisticas();
                    break;
                case 'i':
                    System.out.println("  Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("  Opcion invalida. Intente de nuevo.");
            }
        } while (opcion != 'i');
    }
 
    // --- AGREGAR ANIMAL ---
    private static void menuAgregarAnimal() {
        System.out.println("|------------------------------|");
        System.out.println("|     AGREGAR NUEVO ANIMAL     |");
        System.out.println("|------------------------------|");
        System.out.println("|  1. Mamifero                 |");
        System.out.println("|  2. Ave                      |");
        System.out.println("|  3. Reptil                   |");
        System.out.println("|------------------------------|");
        int tipo = leerEntero("Seleccione el tipo: ");
        switch (tipo) {
            case 1:
                registrarMamifero();
                break;
            case 2:
                registrarAve();
                break;
            case 3:
                registrarReptil();
                break;
            default:
                System.out.println("  Tipo invalido.");
        }
    }
 
    private static void registrarMamifero() {
        if (mamifero != null) {
            System.out.println("  Ya existe un mamifero registrado: " + mamifero.getNombre()
                    + ". Solo se permite uno por tipo.\n");
            return;
        }
        System.out.println("-- Registro de Mamifero --");
        String nombre = leerTexto("Nombre: ");
        int edad = leerEntero("Edad (anos): ");
        double peso = leerDecimal("Peso (kg): ");
        String pelaje = leerTexto("Tipo de pelaje: ");
        int patas = leerEntero("Numero de patas: ");
        double consumo = leerDecimal("Consumo diario (libras/dia): ");
 
        mamifero = new Mamifero(nombre, edad, peso, pelaje, patas, consumo);
        animales[totalAnimales] = mamifero;
        totalAnimales++;
        System.out.println("  Mamifero registrado exitosamente!");
        mamifero.mostrarInfo();
    }
 
    private static void registrarAve() {
        if (ave != null) {
            System.out.println("  Ya existe un ave registrada: " + ave.getNombre()
                    + ". Solo se permite una por tipo.");
            return;
        }
        System.out.println("-- Registro de Ave --");
        String nombre = leerTexto("Nombre: ");
        int edad = leerEntero("Edad (anos): ");
        double peso = leerDecimal("Peso (kg): ");
        double envergadura = leerDecimal("Envergadura de alas (cm): ");
        boolean vuela = leerBooleano("Puede volar? (s/n): ");
        double consumo = leerDecimal("Consumo diario (libras/dia): ");
 
        ave = new Ave(nombre, edad, peso, envergadura, vuela, consumo);
        animales[totalAnimales] = ave;
        totalAnimales++;
        System.out.println("  Ave registrada exitosamente!");
        ave.mostrarInfo();
    }
 
    private static void registrarReptil() {
        if (reptil != null) {
            System.out.println("  Ya existe un reptil registrado: " + reptil.getNombre()
                    + ". Solo se permite uno por tipo.\n");
            return;
        }
        System.out.println("-- Registro de Reptil --");
        String nombre = leerTexto("Nombre: ");
        int edad = leerEntero("Edad (anos): ");
        double peso = leerDecimal("Peso (kg): ");
        String escamas = leerTexto("Tipo de escamas: ");
        boolean venenoso = leerBooleano("Es venenoso? (s/n): ");
        double consumo = leerDecimal("Consumo diario (libras/dia): ");
 
        reptil = new Reptil(nombre, edad, peso, escamas, venenoso, consumo);
        animales[totalAnimales] = reptil;
        totalAnimales++;
        System.out.println("  Reptil registrado exitosamente!");
        reptil.mostrarInfo();
    }
 
    // --- VER ANIMALES ---
    private static void verAnimales() {
        System.out.println("====== ANIMALES EN EL ZOOLOGICO ======");
        if (mamifero == null && ave == null && reptil == null) {
            System.out.println("  No hay animales registrados aun.");
            return;
        }
        if (mamifero != null) mamifero.mostrarInfo();
        if (ave != null)      ave.mostrarInfo();
        if (reptil != null)   reptil.mostrarInfo();
    }
 
    private static void exportarCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("zoologico.csv"))) {

            // Encabezado
            writer.write("Tipo,Nombre,Edad,Peso,ConsumoDiario");
            writer.newLine();

            if (mamifero != null) {
                writer.write("Mamifero," +
                        mamifero.getNombre() + "," +
                        mamifero.getEdad() + "," +
                        mamifero.getPeso() + "," +
                        mamifero.getConsumoDiario());
                writer.newLine();
            }

            if (ave != null) {
                writer.write("Ave," +
                        ave.getNombre() + "," +
                        ave.getEdad() + "," +
                        ave.getPeso() + "," +
                        ave.getConsumoDiario());
                writer.newLine();
            }

            if (reptil != null) {
                writer.write("Reptil," +
                        reptil.getNombre() + "," +
                        reptil.getEdad() + "," +
                        reptil.getPeso() + "," +
                        reptil.getConsumoDiario());
                writer.newLine();
            }

            System.out.println("Datos exportados correctamente a zoologico.csv");

        } catch (IOException e) {
            System.out.println("Error al exportar los datos: " + e.getMessage());
        }
    }

    private static void menuAlimentar() {
        System.out.println("|------------------------------|");
        System.out.println("|       ALIMENTAR ANIMAL       |");
        System.out.println("|------------------------------|");
        System.out.println("|  1. Mamifero                 |");
        System.out.println("|  2. Ave                      |");
        System.out.println("|  3. Reptil                   |");
        System.out.println("|------------------------------|");
        int tipo = leerEntero("Seleccione el tipo: ");

        Animal animal = null;
        switch (tipo) {
            case 1:
                if (mamifero == null) {
                    System.out.println("  No hay mamifero registrado.");
                    return;
                }
                animal = mamifero;
                break;
            case 2:
                if (ave == null) {
                    System.out.println("  No hay ave registrada.");
                    return;
                }
                animal = ave;
                break;
            case 3:
                if (reptil == null) {
                    System.out.println("  No hay reptil registrado.");
                    return;
                }
                animal = reptil;
                break;
            default:
                System.out.println("  Tipo invalido.");
                return;
        }

        System.out.println("\n  " + animal.getNombre() + ": " + animal.alimentarse());

        int dias = leerEntero("  Calcular consumo para cuantos dias? ");
        double total = animal.calcularConsumoRecursivo(dias);
        System.out.println("  Consumo diario: " + animal.getConsumoDiario() + " libras/dia");
        System.out.println("  Consumo total en " + dias + " dias: " + total + " libras");
    }

    // --- OPCIÓN H: MOSTRAR ESTADÍSTICAS ---
    private static void mostrarEstadisticas() {
        if (totalAnimales == 0) {
            System.out.println("\n  No hay animales registrados aun.\n");
            return;
        }

        System.out.println("\n========== ESTADÍSTICAS DEL ZOO ==========");
        System.out.println("Cantidad total de animales registrados: " + totalAnimales);
        System.out.println("Cantidad de mamíferos: " + contarPorTipo("Mamifero"));
        System.out.println("Cantidad de aves: " + contarPorTipo("Ave"));
        System.out.println("Cantidad de reptiles: " + contarPorTipo("Reptil"));
        
        Animal animalMayorConsumo = animalConMayorConsumo();
        if (animalMayorConsumo != null) {
            System.out.println("Animal con mayor consumo de alimento: " + animalMayorConsumo.getNombre());
        }
        
        Animal animalMenorConsumo = animalConMenorConsumo();
        if (animalMenorConsumo != null) {
            System.out.println("Animal con menor consumo de alimento: " + animalMenorConsumo.getNombre());
        }
        
        double promedioEdad = calcularPromedioEdad();
        System.out.println("Promedio de edad de los animales registrados: " + String.format("%.2f", promedioEdad));
        System.out.println("==========================================\n");
    }

    private static int contarPorTipo(String tipo) {
        int contador = 0;
        for (int i = 0; i < totalAnimales; i++) {
            if (animales[i] instanceof Mamifero && tipo.equals("Mamifero")) {
                contador++;
            } else if (animales[i] instanceof Ave && tipo.equals("Ave")) {
                contador++;
            } else if (animales[i] instanceof Reptil && tipo.equals("Reptil")) {
                contador++;
            }
        }
        return contador;
    }

    private static Animal animalConMayorConsumo() {
        if (totalAnimales == 0) return null;
        
        Animal mayor = animales[0];
        for (int i = 1; i < totalAnimales; i++) {
            if (animales[i].getConsumoDiario() > mayor.getConsumoDiario()) {
                mayor = animales[i];
            }
        }
        return mayor;
    }

    private static Animal animalConMenorConsumo() {
        if (totalAnimales == 0) return null;
        
        Animal menor = animales[0];
        for (int i = 1; i < totalAnimales; i++) {
            if (animales[i].getConsumoDiario() < menor.getConsumoDiario()) {
                menor = animales[i];
            }
        }
        return menor;
    }

    private static double calcularPromedioEdad() {
        if (totalAnimales == 0) return 0;
        
        double sumaEdades = 0;
        for (int i = 0; i < totalAnimales; i++) {
            sumaEdades += animales[i].getEdad();
        }
        return sumaEdades / totalAnimales;
    }
 
    // --- HELPERS DE ENTRADA ---
    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("  Ingrese un numero entero valido.");
            }
        }
    }
 
    private static double leerDecimal(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("  Ingrese un numero decimal valido.");
            }
        }
    }
    
    public static char leerLetra(String mensaje) {
        char letra = ' ';
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine().trim().toLowerCase();
            if (entrada.length() == 1 && entrada.charAt(0) >= 'a' && entrada.charAt(0) <= 'i') {
                letra = entrada.charAt(0);
                valido = true;
            } else {
                System.out.println("Opción inválida. Ingrese una letra entre a y la i.");
            }
        }
        return letra;
    }
 
    private static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }
 
    private static boolean leerBooleano(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim().equalsIgnoreCase("s");
    }
}