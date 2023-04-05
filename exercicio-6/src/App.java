public class App {
    public static int soma(int... numeros) {
        int resultado = 0;
        for (int numero: numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int soma1 = soma(8, 4, 6, 2);
        int soma2 = soma(20, 15, 10, 5);
        System.out.println("Soma1: " + soma1);
        System.out.println("Soma2: " + soma2);
    }
}