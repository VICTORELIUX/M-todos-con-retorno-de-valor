public class Operaciones3 {

    // Metodos

    public int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    public int resta(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
    }

    public int multiplicacion(int numero1, int numero2) {
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    public int division(int numero1, int numero2) {
        int division = numero1 / numero2;
        return division;
    }

    public int modulo(int numero1, int numero2) {
        int modulo = numero1 % numero2;
        return modulo;
    }

    public void mostrarResultados(int suma, int resta, int multiplicacion, int division, int modulo) {
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La division es " + division);
        System.out.println("El modulo es " + modulo);

    }
}