package br.edu.ifsp.makeiteasy.front.controller.gerenciamento.cliente;

import br.edu.ifsp.makeiteasy.front.enums.Tela;
import br.edu.ifsp.makeiteasy.front.utils.FabricaAlerts;
import br.edu.ifsp.makeiteasy.front.utils.MascaraUtils;
import br.edu.ifsp.makeiteasy.front.utils.UILoader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

import java.io.IOException;

public class UpdateOrInsertClienteController {
    @FXML
    private Button buttonCancelar;
    @FXML
    private Button buttonConfirmar;
    @FXML
    private DatePicker dtNascimento;

    @FXML
    void initialize() {
        setButtonsClickListener();
        setUpMasks();
    }

    private void setButtonsClickListener() {
        setActionListener(buttonCancelar);
        buttonConfirmar.setOnMouseClicked(mouseEvent -> confirm());
    }

    private void confirm() {
        FabricaAlerts.criarAlertGenerico("Sucesso", "Cliente salvo com sucesso", "Você será redirecionado(a)  ao menu", Alert.AlertType.INFORMATION);
        try {
            UILoader.substituirTela(Tela.MENU_CLIENTE.getNomeTela());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setActionListener(Button button) {
        button.setOnAction(actionEvent -> {
            try {
                UILoader.substituirTela(Tela.MENU_CLIENTE.getNomeTela());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private void setUpMasks(){
        MascaraUtils.mascaraParaData(dtNascimento);
    }
}
