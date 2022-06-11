package br.edu.ifsp.makeiteasy.front.enums;

public enum Tela {
    INITIAL("/views/GerenciamentoLojaView");

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
