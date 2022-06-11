package br.edu.ifsp.makeiteasy.front.enums;

public enum Tela {
    INITIAL("/views/MenuInicialAfvUI"),
    MENU_CLIENTE("/views/MenuCliente"),
    MENU_PRODUTO("/views/MenuProduto"),
    MENU_EMPRESA("/views/MenuEmpresa"),
    MENU_CAMPANHA("/views/MenuCampanha"),
    MENU_REALIZAR_VENDA("/views/RealizarVendaUI");

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
