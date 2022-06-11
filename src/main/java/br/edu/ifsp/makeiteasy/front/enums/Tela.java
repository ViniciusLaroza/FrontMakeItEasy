package br.edu.ifsp.makeiteasy.front.enums;

public enum Tela {
    INITIAL("/views/MenuInicialAfvUI"),
    MENU_CLIENTE("/views/MenuCliente"),
    MENU_PRODUTO("/views/MenuProduto"),
    MENU_EMPRESA("/views/MenuEmpresa"),
    MENU_CAMPANHA("/views/MenuCampanha"),
    MENU_REALIZAR_VENDA("/views/RealizarVendaUI"),
    MENU_RELATORIO_CLIENTE("/views/MenuCliente"),
    MENU_RELATORIO_VENDA("/views/MenuCliente"),
    MENU_RELATORIO_PRODUTO("/views/MenuCliente"),
    UPDATE_OR_INSERIR_CAMPANHA("/views/UpdateOrInserirCampanha"),
    UPDATE_OR_INSERIR_CLIENTE("/views/UpdateOrInserirClient"),
    REMOVER_CLIENTE("/views/RemoverClient"),
    REMOVER_CAMPANHA("/views/RemoverCampanha"),
    ;

    private final String nomeTela;

    Tela(String nomeTela) {
        this.nomeTela = nomeTela;
    }

    public String getNomeTela() {
        return nomeTela;
    }

    @Override
    public String toString() {
        return getNomeTela();
    }
}
