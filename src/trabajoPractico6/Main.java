package trabajoPractico6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de contraseñas que desea generar");
        int quantity = sn.nextInt();
        System.out.println("Ingrese la longitud que desea que tengan sus contraseñas");
        int length = sn.nextInt();

        PasswordGenerator passwordgenerator = new PasswordGenerator(quantity, length);

        passwordgenerator.makePassword();
        for (int i = 0; i < passwordgenerator.getPasswords().length; i++) {
            System.out.println("Contraseña: " + passwordgenerator.getPasswords()[i] +
                    " Longitud: " + passwordgenerator.getPasswordLength() +
                    " Segura: " + passwordgenerator.isSecure(passwordgenerator.getPasswords()[i]));
        }


    }
}
