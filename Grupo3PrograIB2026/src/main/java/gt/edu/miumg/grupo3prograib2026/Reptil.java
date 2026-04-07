package gt.edu.miumg.grupo3prograib2026;

public class Reptil extends Animal {
    private String tipoEscamas;
    private boolean esVenenoso;

    public Reptil() {
        super();
        this.tipoEscamas = "Escamas pequeñas";
        this.esVenenoso = false;
    }

    public Reptil(String nombre, int edad, double peso, String tipoEscamas, boolean esVenenoso) {
        super(nombre, edad, peso);
        this.tipoEscamas = tipoEscamas;
        this.esVenenoso = esVenenoso;
    }

    public Reptil(String nombre, int edad, double peso, String tipoEscamas, boolean esVenenoso, double consumoDiario) {
        super(nombre, edad, peso, consumoDiario);
        this.tipoEscamas = tipoEscamas;
        this.esVenenoso = esVenenoso;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    // Polimorfismo (obligatorios por Animal abstract)
    @Override
    public String emitirSonido() {
        return "Ssssss";
    }

    @Override
    public String moverse() {
        return "Repta/desliza por el suelo";
    }

    @Override
    public String alimentarse() {
        return esVenenoso ? "Caza e inmoviliza con veneno" : "Caza y traga su presa";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== DATOS DEL REPTIL ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Tipo de escamas: " + tipoEscamas);
        System.out.println("Es venenoso?: " + (esVenenoso ? "Si" : "No"));
        if (getConsumoDiario() > 0) {
            System.out.println("Consumo diario: " + getConsumoDiario() + " libras/dia");
        }
        System.out.println("------------------------");
    }
}