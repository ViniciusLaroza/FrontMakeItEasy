package br.edu.ifsp.makeiteasy.front.controller.gerenciamento.campanha;

import br.edu.ifsp.makeiteasy.front.enums.Tela;
import br.edu.ifsp.makeiteasy.front.utils.UILoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class UpdateOrInsertCampanhaController {
    @FXML
    private Button buttonCancelar;

    @FXML
    void initialize(){
        setButtonsClickListener();
    }

    private void setButtonsClickListener(){
       setActionListener(buttonCancelar);
    }
    private void setActionListener(Button button){
        button.setOnAction(actionEvent -> {
            try {
                UILoader.substituirTela(Tela.MENU_CAMPANHA.getNomeTela());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}