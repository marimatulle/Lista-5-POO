public class App {
    public static void main(String[] args) throws Exception {
        double[] numeros = {2.5, 4.8, 6.3, 8.1, 9.2};
        double soma = 0;

        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        double media = soma / numeros.length;
        System.out.printf("A média dos números é: %.2f", media);
    }
}
