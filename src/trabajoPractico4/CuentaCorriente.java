package trabajoPractico4;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

   public CuentaCorriente(String nombreTitular, double saldo) {
       this.nombreTitular = nombreTitular;
       this.saldo = saldo;
       this.numeroCuenta = (long)(Math.random() * 999999999) + 1;
   }

   public void deposit(double money) {
       this.saldo += money;
   }

   public void refund(double money) {
       this.saldo -= money;
   }

   public double getSaldo() {
       return this.saldo;
   }

   public String getDataAccount() {
       return "Número de cuenta: " + this.numeroCuenta +
               "\nNombre del Titular: " + this.nombreTitular +
               "\nSaldo: $" + this.saldo;
   }

   public void transferMoney(CuentaCorriente from, CuentaCorriente to, double money) {
       from.refund(money);
       to.deposit(money);
   }
}
