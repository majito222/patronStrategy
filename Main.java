public class Main {
    public static void main(String[] args) {
        List<Producto> productos = List.of(
                new Producto("Camiseta", 100, new EstrategiaDescuentoPorcentual(20)),
                new Producto("Pantalon", 500, new EstrategiaDescuentoFijo(50)),
                new Producto("Zapatillas", 200, new EstrategiaDescuentoPorcentual(10))
        );

        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.nombre + ", Precio con descuento: " + producto.calcularPrecioConDescuento());
        }
    }
}