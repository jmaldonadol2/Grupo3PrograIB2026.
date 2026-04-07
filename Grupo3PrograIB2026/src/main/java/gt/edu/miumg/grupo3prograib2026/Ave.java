package gt.edu.miumg.grupo3prograib2026;

public class Ave extends Animal {
    private double envergaduraAlas;
    private boolean puedeVolar;

    public Ave() {
        super();
        this.envergaduraAlas = 0.0;
        this.puedeVolar = true;
    }

    public Ave(String nombre, int edad, double peso, double envergaduraAlas, boolean puedeVolar) {
        super(nombre, edad, peso);
        this.envergaduraAlas = envergaduraAlas;
        this.puedeVolar = puedeVolar;
    }

    public Ave(String nombre, int edad, double peso, double envergaduraAlas, boolean puedeVolar, double consumoDiario) {
        super(nombre, edad, peso, consumoDiario);
        this.envergaduraAlas = envergaduraAlas;
        this.puedeVolar = puedeVolar;
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

    // Polimorfismo (obligatorios por Animal abstract)
    @Override
    public String emitirSonido() {
        return "Kii-kii";
    }

    @Override
    public String moverse() {
        return puedeVolar
                ? "Vuela con " + envergaduraAlas + " cm de envergadura"
                : "Camina (no vuela)";
    }

    @Override
    public String alimentarse() {
        return "Picotea su alimento";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== DATOS DEL AVE ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Envergadura de alas: " + envergaduraAlas + " cm");
        System.out.println("Puede volar?: " + (puedeVolar ? "Si" : "No"));
        if (getConsumoDiario() > 0) {
            System.out.println("Consumo diario: " + getConsumoDiario() + " libras/dia");
        }
        System.out.println("---------------------");
    }
}