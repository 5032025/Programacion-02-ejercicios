public class Multiplos {
    public static void main(String[] args) {
        byte maximo = 30;
        byte multiplo = 3;

        System.out.println("Estos son los multiplos de 3 hasta el: " + maximo);

        do {
            if (multiplo % 3 == 0) {
                System.out.println(multiplo);
            }
            multiplo++;
        } while (multiplo <= maximo);
    }
}
