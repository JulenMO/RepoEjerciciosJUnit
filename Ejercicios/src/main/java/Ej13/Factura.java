package Ej13;

import java.util.Vector;

public class Factura {
	private Vector<Producto> productos = new Vector<Producto>();

	/**
	 * Añade un producto a la lista de productos
	 * 
	 * @param p El producto a añadir
	 */
	public void meterProducto(Producto p) {
		productos.add(p);
	}

	/**
	 * Factura total de la lista de productos
	 * 
	 * @return Retorna el precio conjunto de todos los productos de la lista
	 */
	public float totalFactura() {
		float factura = 0;
		for (Producto p : productos) {
			factura += p.precioTotal();
		}
		return factura;
	}

	/**
	 * Aplica el IVA al precio normal
	 * 
	 * @param iva IVA a aplicar
	 * @return Devuelve el precio con el IVA aplicado
	 */
	public float aplicarIva(float iva) {
		float pConIva = totalFactura() * (1 + (iva / 100));
		return pConIva;
	}
}
