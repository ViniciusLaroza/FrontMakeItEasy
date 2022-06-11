module br.edu.ifsp.makeiteasy.front {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.ifsp.makeiteasy.front;
    opens br.edu.ifsp.makeiteasy.front.enums to javafx.fxml;
    opens br.edu.ifsp.makeiteasy.front.utils to javafx.fxml, javafx.base;
    exports br.edu.ifsp.makeiteasy.front;
}