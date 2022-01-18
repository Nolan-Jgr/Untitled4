package sample;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.scene.control.*;


public class Controller {
    public TextField s;
    public TextField s2;
    public Label out;

    public void add(ActionEvent actionEvent) {
        int x = Integer.parseInt(s.getText());
        int y = Integer.parseInt(s2.getText());
        out.setText("" + (x+y));
    }

    public void clear(ActionEvent actionEvent) {
            s.setText("");
            s2.setText("");
            out.setText("");
    }
}
