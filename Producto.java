public class Producto {
    private String nombre;
    private double precio;
    private EstrategiaDescuento estrategiaDescuento;

    public Producto(String nombre, double precio, EstrategiaDescuento estrategiaDescuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.estrategiaDescuento = estrategiaDescuento;
    }

    public double calcularPrecioConDescuento() {
        return estrategiaDescuento.aplicarDescuento(precio);
    }
}