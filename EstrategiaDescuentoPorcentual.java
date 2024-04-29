public class EstrategiaDescuentoPorcentual implements EstrategiaDescuento {
    private double porcentaje;

    public EstrategiaDescuentoPorcentual(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio * (1 - porcentaje / 100);
    }
}