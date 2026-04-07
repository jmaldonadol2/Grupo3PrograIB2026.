package gt.edu.miumg.grupo3prograib2026;

import java.util.Scanner;

public class Grupo3PrograIB2026 {
    private static Mamifero mamifero = null;
    private static Ave ave = null;
    private static Reptil reptil = null;
    private static Scanner scanner = new Scanner(System.in);
 
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
                    System.out.println("  [Fase II - En construccion]");
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
        System.out.println("|------------------------------|");
        System.out.println("|ZOOLOGICO LA AURORA - SISTEMA |");
        System.out.println("|------------------------------|");
        System.out.println("|  1. Zoo                      |");
        System.out.println("|  2. Fase II                  |");
        System.out.println("|  3. Fase III                 |");
        System.out.println("|  4. Salir                    |");
        System.out.println("|------------------------------|");
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
            // Opcion CSV pendiente 
            // 3. Exportar datos a CSV     
            System.out.println("|  3. Volver al menu principal        |");
            System.out.println("|-------------------------------------|");
            opcion = leerEntero("Seleccione una opcion: ");
            switch (opcion) {
                case 1:
                    menuAgregarAnimal();
                    break;
                case 2:
                    verAnimales();
                    break;
                // case 3 -> exportarCSV()- para la asignacion estaria acá segun las instruciones
                // Corregir el case siguiente que seria = 4
                case 3:
                    System.out.println("  Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("  Opcion invalida. Intente de nuevo.");
            }
        } while (opcion != 3);
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
 
    private static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }
 
    private static boolean leerBooleano(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim().equalsIgnoreCase("s");
    }
}