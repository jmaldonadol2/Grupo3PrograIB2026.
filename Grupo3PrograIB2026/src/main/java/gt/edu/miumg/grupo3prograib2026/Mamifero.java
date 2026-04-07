package gt.edu.miumg.grupo3prograib2026;

public class Mamifero extends Animal {
    private String tipoPelaje;
    private int numeroPatas;

    public Mamifero() {
        super();
        this.tipoPelaje = "Desconocido";
        this.numeroPatas = 4;
    }

    public Mamifero(String nombre, int edad, double peso, String tipoPelaje, int numeroPatas) {
        super(nombre, edad, peso);
        this.tipoPelaje = tipoPelaje;
        this.numeroPatas = numeroPatas;
    }

    public Mamifero(String nombre, int edad, double peso, String tipoPelaje, int numeroPatas, double consumoDiario) {
        super(nombre, edad, peso, consumoDiario);
        this.tipoPelaje = tipoPelaje;
        this.numeroPatas = numeroPatas;
    }

    public String getTipoPelaje() { return tipoPelaje; }
    public void setTipoPelaje(String tipoPelaje) { this.tipoPelaje = tipoPelaje; }

    public int getNumeroPatas() { return numeroPatas; }
    public void setNumeroPatas(int numeroPatas) { this.numeroPatas = numeroPatas; }

    // Polimorfismo (obligatorios por Animal abstract)
    @Override
    public String emitirSonido() { return "Guau guau"; }

    @Override
    public String moverse() { return "Camina/corre con " + numeroPatas + " patas"; }

    @Override
    public String alimentarse() { return "Se alimenta como mamifero"; }

    @Override
    public void mostrarInfo() {
        System.out.println("=== DATOS DEL MAMIFERO ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Tipo de pelaje: " + tipoPelaje);
        System.out.println("Numero de patas: " + numeroPatas);
        if (getConsumoDiario() > 0) {
            System.out.println("Consumo diario: " + getConsumoDiario() + " libras/dia");
        }
        System.out.println("--------------------------");
    }
}