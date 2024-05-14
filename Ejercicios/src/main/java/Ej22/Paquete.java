package Ej22;

public class Paquete {
	private String destino;
	private float peso;

	public Paquete(float peso) {
		super();
		this.peso = peso;
	}

	public Paquete(String destino, float peso) {
		super();
		this.destino = destino;
		this.peso = peso;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

}
