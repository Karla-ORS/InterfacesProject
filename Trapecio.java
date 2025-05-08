
public class Trapecio {
	private String nombre;
	private double baseMayor;
	private double baseMenor;
	private double lado1;
	private double lado2;
	private double altura;

	public Trapecio(String nombre, double baseMayor, double baseMenor, double lado1, double lado2, double altura) {
		this.nombre = nombre;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
	}

	public double calcularArea() {
		return ((baseMayor + baseMenor) * altura) / 2;
	}

	public double calcularPerimetro() {
		return baseMayor + baseMenor + lado1 + lado2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getBaseMayor() {
		return baseMayor;
	}

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Trapecio [" + nombre + "] - B=" + baseMayor + ", b=" + baseMenor + ", lados=" + lado1 + "," + lado2 + ", h=" + altura;
	}
}
