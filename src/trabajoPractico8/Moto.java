package tp8;

public class Moto implements Vehiculo {
    private int velocidad = 0;

    public Moto(int velocidad) {
        if(velocidad > VELOCIDAD_MAXIMA) {
            System.out.println("La velocidad inicial ha superado la velocidad máxima ha sido superada");
        }
        this.velocidad = velocidad;
    }

    @Override
    public int plazas() {
        return 2;
    }

    @Override
    public String acelerar(int cantidadAcelerar) {
        this.velocidad += cantidadAcelerar;
        if(this.velocidad > VELOCIDAD_MAXIMA) {
            return "La velocidad máxima ha sido superada";
        } else {
            return "La velocidad máxima no ha sido superada";
        }
    }

    @Override
    public String frenar(int cantidadFrenar) {
        this.velocidad -= cantidadFrenar;
        if(this.velocidad < 0) {
            this.velocidad = 0;
        }
        return "La velocidad ha sido reducida, ahora vas a " + this.velocidad;
    }
}
