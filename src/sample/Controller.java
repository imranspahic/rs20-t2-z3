package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.util.Locale;

public class Controller {
    public TextArea textArea;

    public void sacuvaj(ActionEvent actionEvent) {
        String text = textArea.getText();
        String[] rijeci = text.split(" ");
        String najduzaRijec = rijeci[0];
        int indeks = 0;
        for(int i = 0; i < rijeci.length; i++) {
            if(rijeci[i].length() > najduzaRijec.length()) {
                najduzaRijec = rijeci[i];
                indeks = i;
            }
        }
        String velikaSlova = najduzaRijec.toUpperCase(Locale.ROOT);
        rijeci[indeks] = velikaSlova;
       String finalniTekst = String.join(" ", rijeci);
       textArea.setText(finalniTekst);
    }
}
