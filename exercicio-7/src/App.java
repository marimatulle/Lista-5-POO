public class App {
  public static void main(String[] args) {
    int[][] A = new int[3][3];
    int count = 0;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        A[i][j] = count;
        count++;
      }
    }

    System.out.println("Matriz A:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
}

