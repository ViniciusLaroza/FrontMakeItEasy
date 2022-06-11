package br.edu.ifsp.makeiteasy.front.controller.gerenciamento.campanha;

import br.edu.ifsp.makeiteasy.front.enums.Tela;
import br.edu.ifsp.makeiteasy.front.utils.UILoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuCampanhaController {
    @FXML
    private Button buttonInserir;
    @FXML
    private Button buttonAlterar;
    @FXML
    private Button buttonRemover;
    @FXML
    private Button buttonVoltar;

    @FXML
    void initialize(){
       setButtonsClickListener();
    }

    private void setButtonsClickListener(){
        setActionListener(buttonInserir,Tela.UPDATE_OR_INSERIR_CAMPANHA);
        setActionListener(buttonAlterar,Tela.UPDATE_OR_INSERIR_CAMPANHA);
        setActionListener(buttonVoltar,Tela.INITIAL);
        //todo criar essa tela
        setActionListener(buttonRemover,Tela.REMOVER_CAMPANHA);
    }
    private void setActionListener(Button button, Tela tela){
        button.setOnAction(actionEvent -> {
            try {
                UILoader.substituirTela(tela.getNomeTela());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
