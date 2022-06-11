package br.edu.ifsp.makeiteasy.front.controller;

import br.edu.ifsp.makeiteasy.front.enums.Tela;
import br.edu.ifsp.makeiteasy.front.utils.UILoader;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

import java.io.IOException;

public class MenuInicialController {
    @FXML
    private MenuItem menuItemCadastrosCliente;
    @FXML
    private MenuItem menuItemCadastrosCampanha;
    @FXML
    private MenuItem menuItemCadastrosEmpresa;
    @FXML
    private MenuItem menuItemCadastrosProduto;

    @FXML
    private MenuItem menuItemProcessosVenda;

    @FXML
    private MenuItem menuItemRelatorioVenda;
    @FXML
    private MenuItem menuItemRelatorioCliente;
    @FXML
    private MenuItem menuItemRelatorioProduto;

    @FXML
    void initialize(){
        setUpMenuListeners();
    }

    private void setUpMenuListeners(){
        setGerenciamentoMenuListeners();
        setVendaMenuListeners();
        setRelatorioMenuListeners();
    }

    private void setGerenciamentoMenuListeners(){
        setActionListener(menuItemCadastrosCliente,Tela.MENU_CLIENTE);
        setActionListener(menuItemCadastrosCampanha,Tela.MENU_CAMPANHA);
        setActionListener(menuItemCadastrosEmpresa,Tela.MENU_EMPRESA);
        setActionListener(menuItemCadastrosProduto,Tela.MENU_PRODUTO);
    }


    private void setVendaMenuListeners(){
        setActionListener(menuItemProcessosVenda,Tela.MENU_REALIZAR_VENDA);
    }

    private void setRelatorioMenuListeners(){
        //todo criar telas
        setActionListener(menuItemRelatorioVenda,Tela.MENU_CLIENTE);
        setActionListener(menuItemRelatorioCliente,Tela.MENU_CLIENTE);
        setActionListener(menuItemRelatorioProduto,Tela.MENU_CLIENTE);
    }

    private void setActionListener(MenuItem menuItem, Tela tela){
        menuItem.setOnAction(actionEvent -> {
            try {
                UILoader.substituirTela(tela.getNomeTela());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}
