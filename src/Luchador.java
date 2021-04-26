
public class Luchador {
	private double altura;
	private double peso;
	public int dominados;

	public Luchador(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
		this.dominados = 0;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getDominados() {
		return dominados;
	}

	public void setDominados(int dominados) {
		this.dominados = dominados;
	}

	public boolean dominaA(Luchador otro) {
		return this.getAltura() >= otro.getAltura() && this.getPeso() >= otro.getPeso();
	}

}
