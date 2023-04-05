public class App {
    public static void main(String[] args) throws Exception {
    double [] array1 = new double[12];
    double [] array2 = {1,2,3,4,5,6,7,8,9,10,11,12};

    System.out.printf("%s%8s\n"
    ,
    "Índice"
    ,
    "Valor");

    for (int i = 0; i < array1.length; i++)
    System.out.printf("%d\t%f\n", i, array1[i]);

    System.out.printf("===================================\n");

    for (int i = 0; i < array2.length; i++)
    System.out.printf("%d\t%f\n", i, array2[i]);
    }
}
