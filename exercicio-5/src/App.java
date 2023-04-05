import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{5, 8, 10, 3, 6, 12, 7, 1, 9, 4};

        // lê o número que o usuário digitar
        System.out.print("Digite um número inteiro, positivo e maior que zero: ");
        int x = scanner.nextInt();

        // encontra o par de posições consecutivas com maior diferença
        int maxDiff = Integer.MIN_VALUE;
        int pos1 = 0;
        int pos2 = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(array[i] - array[i+1]);
            if (diff > maxDiff) {
                maxDiff = diff;
                pos1 = i;
                pos2 = i+1;
            }
        }

        System.out.println("Par de posições com maior diferença: " + pos1 + " e " + pos2);

        // verifica se o array ta em ordem crescente, decrescente ou não ordenado
        boolean crescente = true;
        boolean decrescente = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                crescente = false;
            }
            if (array[i] < array[i+1]) {
                decrescente = false;
            }
        }

        if (crescente) {
            System.out.println("O array está em ordem crescente.");
        } else if (decrescente) {
            System.out.println("O array está em ordem decrescente.");
        } else {
            System.out.println("O array não está ordenado.");
        }

        // conta quantos números são maiores, menores e iguais ao número digitado pelo usuário
        int maiores = 0;
        int menores = 0;
        int iguais = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > x) {
                maiores++;
            } else if (array[i] < x) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.println("Números maiores: " + maiores);
        System.out.println("Números menores: " + menores);
        System.out.println("Números iguais: " + iguais);
    }
}
