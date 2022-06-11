package br.edu.ifsp.makeiteasy.front.controller.venda;

import br.edu.ifsp.makeiteasy.front.enums.Tela;
import br.edu.ifsp.makeiteasy.front.utils.FabricaAlerts;
import br.edu.ifsp.makeiteasy.front.utils.UILoader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.io.IOException;

public class RealizarVendaController {
    @FXML
    private Button buttonCancelar;
    @FXML
    private Button buttonConfirmar;


    @FXML
    void initialize(){
        setButtonsClickListener();
        buttonConfirmar.setOnMouseClicked(mouseEvent -> confirm());
    }

    private void setButtonsClickListener(){
        setActionListener(buttonCancelar);
    }
    private void confirm(){
        FabricaAlerts.criarAlertGenerico("Sucesso","Venda efetuada","Você será redirecionado(a) ao início", Alert.AlertType.INFORMATION);
        try {
            UILoader.substituirTela(Tela.MENU_PRODUTO.getNomeTela());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void setActionListener(Button button){
        button.setOnAction(actionEvent -> {
            try {
                UILoader.substituirTela(Tela.INITIAL.getNomeTela());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
