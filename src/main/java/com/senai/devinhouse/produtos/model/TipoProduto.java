package com.senai.devinhouse.produtos.model;

public enum TipoProduto {

    ESCRITORIO(0),
    GAMES(1),
    MOVEIS(2),
    ALIMENTACAO(3);

    private Integer codigo;

    TipoProduto(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public static TipoProduto fromCodigo(Integer codigo) {
        switch (codigo) {
            case 0:
                return TipoProduto.ESCRITORIO;
            case 1:
                return TipoProduto.GAMES;
            case 2:
                return TipoProduto.MOVEIS;
            case 3:
                return TipoProduto.ALIMENTACAO;
            default:
                throw new IllegalArgumentException("Código para tipo de produto inválido.");
        }
    }

}
