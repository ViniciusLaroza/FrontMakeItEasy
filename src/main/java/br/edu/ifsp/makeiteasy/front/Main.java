package br.edu.ifsp.makeiteasy.front;

import br.edu.ifsp.makeiteasy.front.enums.Tela;
import br.edu.ifsp.makeiteasy.front.utils.UILoader;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(UILoader.loadFXML(Tela.INITIAL.getNomeTela()));
        UILoader.setScene(scene);
        stage.setMaximized(true);

        stage.setMinWidth(350);
        stage.setScene(scene);
        stage.show();
    }
}
