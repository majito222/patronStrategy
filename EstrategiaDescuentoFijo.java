public class EstrategiaDescuentoFijo implements EstrategiaDescuento {
    private double montoFijo;

    public EstrategiaDescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - montoFijo;
    }
}