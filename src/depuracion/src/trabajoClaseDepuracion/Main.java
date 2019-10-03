package trabajoClaseDepuracion;
public class Main {

    public static void main(String[] args) {
        // El problema es que el array no se ordena.

        int arr[] ={3,60,35,2,45,320,5};

        System.out.println("Array antes de ser ordenado");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Array despues de ser ordenado");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 1;
        for(int i=1; i < n; i++){
            for(int j=0; j < (n-i); j++){
                if(arr[j] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = temp;
                    arr[j] = arr[i];
                }

            }
        }
    }
}

