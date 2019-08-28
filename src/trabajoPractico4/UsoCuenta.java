package trabajoPractico4;

public class UsoCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("Antonio Garivaldi", 500);
        CuentaCorriente cuenta2 = new CuentaCorriente("Felipe Stalcar", 200);

        cuenta1.transferMoney(cuenta1, cuenta2, 200);

        System.out.println(cuenta1.getDataAccount());
        System.out.println("");
        System.out.println(cuenta2.getDataAccount());
    }
}
