public class App {
    public static void main(String[] args) throws Exception {
    int [] array = new int [5];
   
    for (int i = 0; i < array.length; i++)
        array[i] = i + 1;
   
    System.out.printf("%s\n","Valor:");
        for (int i = 0; i < array.length; i++)
        
    System.out.printf("%d\n", array[i]);
    }
}
