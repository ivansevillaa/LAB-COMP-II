package trabajoPractico3;

public class Ejercicio1 {
    public static void main(String[] args) {
        int [] numeros = new int [100];

        for (int i = 0; i < numeros.length; i++)
            numeros[i] = (int)((Math.random() * 100) + 1);

        for (int numero : numeros)
            System.out.print(numero + " ");
    }
}
