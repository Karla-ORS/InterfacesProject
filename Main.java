
public class Main {

    public static void main(String[] args) {
        // Crear cada figura con datos de ejemplo
        Triangulo triangulo = new Triangulo("Triángulo Bermudas", 20, 10, 15);
        Cuadrado cuadrado = new Cuadrado("Cuadrado Azul", 5);
        Rectangulo rectangulo = new Rectangulo("Rectángulo Verde", 8, 4);
        Rombo rombo = new Rombo("Rombo Café", 6, 10, 8);
        Romboide romboide = new Romboide("Romboide Oscuro", 7, 3);
        Trapecio trapecio = new Trapecio("Trapecio Amarillo", 6, 4, 5, 5, 3);

        // Imprimir resultados
        imprimirCalculos(triangulo);
        imprimirCalculos(cuadrado);
        imprimirCalculos(rectangulo);
        imprimirCalculos(rombo);
        imprimirCalculos(romboide);
        imprimirCalculos(trapecio);
    }

    // Método sobrecargado para cada clase
    public static void imprimirCalculos(Triangulo t) {
        System.out.println(t);
        System.out.println("+--------------------------------------+");
        System.out.println("| Área: " + t.calcularArea());
        System.out.println("| Perímetro: " + t.calcularPerimetro());
        System.out.println("+--------------------------------------+\n");
    }

    public static void imprimirCalculos(Cuadrado c) {
        System.out.println(c);
        System.out.println("+--------------------------------------+");
        System.out.println("| Área: " + c.calcularArea());
        System.out.println("| Perímetro: " + c.calcularPerimetro());
        System.out.println("+--------------------------------------+\n");
    }

    public static void imprimirCalculos(Rectangulo r) {
        System.out.println(r);
        System.out.println("+--------------------------------------+");
        System.out.println("| Área: " + r.calcularArea());
        System.out.println("| Perímetro: " + r.calcularPerimetro());
        System.out.println("+--------------------------------------+\n");
    }

    public static void imprimirCalculos(Rombo r) {
        System.out.println(r);
        System.out.println("+--------------------------------------+");
        System.out.println("| Área: " + r.calcularArea());
        System.out.println("| Perímetro: " + r.calcularPerimetro());
        System.out.println("+--------------------------------------+\n");
    }

    public static void imprimirCalculos(Romboide r) {
        System.out.println(r);
        System.out.println("+--------------------------------------+");
        System.out.println("| Área: " + r.calcularArea());
        System.out.println("| Perímetro: " + r.calcularPerimetro());
        System.out.println("+--------------------------------------+\n");
    }

    public static void imprimirCalculos(Trapecio t) {
        System.out.println(t);
        System.out.println("+--------------------------------------+");
        System.out.println("| Área: " + t.calcularArea());
        System.out.println("| Perímetro: " + t.calcularPerimetro());
        System.out.println("+--------------------------------------+\n");
    }
}
