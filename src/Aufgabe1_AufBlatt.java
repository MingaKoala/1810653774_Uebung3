import javax.swing.*;

public class Aufgabe1_AufBlatt {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, addNumbers(9, 2));

    }

    public static int addNumbers(int a, int b) {

        int erg = a + b;
        while (true) {
            if (erg % 2 == 0) {
                return erg;
            } else {
                erg = erg + erg;
            }

        }
    }
}


