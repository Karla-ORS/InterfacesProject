
public class Rombo {
	private String nombre;
	private double lado;
	private double diagonalMayor;
	private double diagonalMenor;

	public Rombo(String nombre, double lado, double diagonalMayor, double diagonalMenor) {
		this.nombre = nombre;
		this.lado = lado;
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
	}

	public double calcularArea() {
		return (diagonalMayor * diagonalMenor) / 2;
	}

	public double calcularPerimetro() {
		return 4 * lado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getDiagonalMayor() {
		return diagonalMayor;
	}

	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	@Override
	public String toString() {
		return "Rombo [" + nombre + "] - lado=" + lado + ", D=" + diagonalMayor + ", d=" + diagonalMenor;
	}
}
