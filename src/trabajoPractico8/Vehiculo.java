package tp8;

public interface Vehiculo {
    final int VELOCIDAD_MAXIMA = 120;

    int plazas();

    String acelerar(int cantidadAcelerar);

    String frenar(int cantidadFrenar);
}
