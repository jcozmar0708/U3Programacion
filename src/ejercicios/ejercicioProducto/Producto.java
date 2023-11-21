package ejercicios.ejercicioProducto;

public class Producto {
    private String descripcion;
    private double precio;

    public Producto() {
    }

    public Producto(String descripcion, double precio) throws Exception {
        if (precio <= 0) {
            throw new Exception("El precio no puede ser negativo");
        }
        if (descripcion == null || descripcion.length() == 0) {
            throw new Exception("La descripción no puede estar vacía");
        }
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
}
