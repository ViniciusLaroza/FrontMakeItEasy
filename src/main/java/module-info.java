module br.edu.ifsp.makeiteasy.front {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.ifsp.makeiteasy.front;
    opens br.edu.ifsp.makeiteasy.front.enums to javafx.fxml;
    opens br.edu.ifsp.makeiteasy.front.utils to javafx.fxml, javafx.base;
    opens br.edu.ifsp.makeiteasy.front.controller to javafx.fxml, javafx.base;
    opens br.edu.ifsp.makeiteasy.front.controller.venda to javafx.fxml, javafx.base;
    opens br.edu.ifsp.makeiteasy.front.controller.gerenciamento.cliente to javafx.fxml, javafx.base;
    opens br.edu.ifsp.makeiteasy.front.controller.gerenciamento.campanha to javafx.fxml, javafx.base;
    exports br.edu.ifsp.makeiteasy.front;
}