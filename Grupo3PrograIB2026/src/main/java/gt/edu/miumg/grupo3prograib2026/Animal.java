package gt.edu.miumg.grupo3prograib2026;

public abstract class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private double consumoDiario;

    public Animal() {}

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public Animal(String nombre, int edad, double peso, double consumoDiario) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.consumoDiario = consumoDiario;
    }

    // getters/setters (igual que ya los tienes)...

    public abstract String emitirSonido();
    public abstract String moverse();
    public abstract String alimentarse();

    public void mostrarInfo() {
        System.out.println("=== DATOS DEL ANIMAL ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Peso: " + getPeso() + " kg");
        if (getConsumoDiario() > 0) {
            System.out.println("Consumo diario: " + getConsumoDiario() + " libras/dia");
        }
        System.out.println("---------------------");
    }

    public double calcularConsumoRecursivo(int dias) {
        if (dias <= 0) return 0;
        return consumoDiario + calcularConsumoRecursivo(dias - 1);
    }

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

    // getters y setters (asegúrate de mantenerlos)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public double getConsumoDiario() { return consumoDiario; }
    public void setConsumoDiario(double consumoDiario) { this.consumoDiario = consumoDiario; }
}