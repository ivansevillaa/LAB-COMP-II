package trabajoPractico6;

public class PasswordGenerator {
    private String passwords[];
    private int passwordLength;
    private char[] chars = { '0','1','2','3','4','5','6','7','8','9',
            'a','b','c','d','e','f','g','h','i','j',
            'k','l','m','n','o','p','q','r','s','t',
            'u','v','w','x','y','z','A','B','C','D',
            'E','F','G','H','I','J','K','L','M','N',
            'O','P','Q','R','S','T','U','V','W','X',
            'Y','Z' };

    public PasswordGenerator (int passwordsQuantity, int passwordLength) {
        this.passwords = new String [passwordsQuantity];
        this.passwordLength = passwordLength;
    }

    public String[] getPasswords() {
        return passwords;
    }

    public int getPasswordLength() {
        return this.passwordLength;
    }

    public void makePassword() {
        for (int i = 0; i < this.passwords.length; i++) {
            this.passwords[i] = "";
            for (int j = 1; j <= this.passwordLength; j++) {
                this.passwords[i] += chars[(int)(Math.random()*61)];
            }
        }
    }

    public boolean isSecure(String password) {
        int uppercases = 0, lowercases = 0, numbers = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                uppercases++;
            } else if ((Character.isLowerCase(password.charAt(i)))) {
                 lowercases++;
            } else {
                numbers++;
            }
        }

        if (numbers > 5 && uppercases > 2 && lowercases > 1) {
            return true;
        } else {
            return false;
        }
    }
}
