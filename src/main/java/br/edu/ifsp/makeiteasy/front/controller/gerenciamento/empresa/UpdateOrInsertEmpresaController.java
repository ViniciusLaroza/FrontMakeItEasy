package br.edu.ifsp.makeiteasy.front.controller.gerenciamento.empresa;

import br.edu.ifsp.makeiteasy.front.enums.Tela;
import br.edu.ifsp.makeiteasy.front.utils.FabricaAlerts;
import br.edu.ifsp.makeiteasy.front.utils.UILoader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.io.IOException;

public class UpdateOrInsertEmpresaController {
    @FXML
    private Button buttonCancelar;
    @FXML
    private Button buttonConfirmar;

    @FXML
    void initialize(){
        setButtonsClickListener();
    }

    private void setButtonsClickListener(){
       setActionListener(buttonCancelar);
        buttonConfirmar.setOnMouseClicked(mouseEvent -> confirm());
    }


    private void confirm(){
        FabricaAlerts.criarAlertGenerico("Sucesso","Empresa salva com sucesso","Você será redirecionado(a)  ao menu", Alert.AlertType.INFORMATION);
        try {
            UILoader.substituirTela(Tela.MENU_EMPRESA.getNomeTela());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setActionListener(Button button){
        button.setOnAction(actionEvent -> {
            try {
                UILoader.substituirTela(Tela.MENU_EMPRESA.getNomeTela());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}
