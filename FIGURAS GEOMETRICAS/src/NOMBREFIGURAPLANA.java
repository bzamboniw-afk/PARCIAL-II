public class NombreFigura extends FIGURAPLANA {

    private double medida;

    public NombreFigura(String nombre, double medida) {
        super(nombre);
        this.medida = medida;
    }

    @Override
    public double calcularArea() {
        // Aquí colocas la fórmula
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        // Aquí colocas la fórmula
        return 0;
    }
}