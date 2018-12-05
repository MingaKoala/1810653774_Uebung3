import javax.swing.*;

public class Aufgabe_2 {
    public static void main(String[] args) {

        partialString(JOptionPane.showInputDialog("Gib deinen Namen ein"));
        //Aufgabe 2 : Aufrufen der Methode siehe eins drüber

        // Aufgabe 3: Aufrud der Klasse Taschenrechner

        System.out.println("\nRechnen mit ganzen Zahlen:");
        System.out.println(Taschenrechner.Addieren(10,5));
        System.out.println(Taschenrechner.Subtrahieren(10,5));
        System.out.println(Taschenrechner.Multiplizieren(10, 5));
        System.out.println(Taschenrechner.Dividieren(10, 5));

        System.out.println("\nRechnen mit Kommazahlen:");
        System.out.println(Taschenrechner.Addieren(10, 2.5));
        System.out.println(Taschenrechner.Subtrahieren(10, 2.5));
        System.out.println(Taschenrechner.Multiplizieren(10, 2.5));
        System.out.println(Taschenrechner.Dividieren(10, 2.5));
    }

    //Aufgabe 2

    public static void partialString (String a){

        if(a.length() < 3) // lenght gibt die länge der einzelnen zeichen bzw die anzahl wieder in dem Fall vom String
        {
            System.err.println("zu kurz");
        }
        else{
            System.out.println(a.substring(a.length()/2));
             /*substring() gibt eineen Teil des Strings wieder
            bei ungeraden Zeichenketten wird der kürzere Teil des Strings wiedergegeben, weil 5/2 = 2
             */
        }
    }

}

