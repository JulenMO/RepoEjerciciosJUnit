package Ej13;

public class Producto {
	private String nombre;
	private float precio;
	private int cantidad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Constructor
	 * 
	 * @param nombre   Nombre del producto
	 * @param precio   Precio del producto
	 * @param cantidad Cantidad del producto
	 */
	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	/**
	 * Precio conjunto
	 * 
	 * @return Retorna el precio total de los productos en conjunto
	 */
	public float precioTotal() {
		return precio * cantidad;
	}

	public String toString() {
		return nombre + " " + precio + " " + cantidad;
	}
}
