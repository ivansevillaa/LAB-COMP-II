package trabajoPractico3;

public class Ejercicio2 {
    public static void main(String[] args) {
        int [][] numeros = new int [3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int)((Math.random() * 9) + 1);
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }
}

