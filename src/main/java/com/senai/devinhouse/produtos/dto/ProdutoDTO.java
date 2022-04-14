package com.senai.devinhouse.produtos.dto;

import com.senai.devinhouse.produtos.model.TipoProduto;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class ProdutoDTO {

    @NotNull
    private Long id;

    private String descricao;

    private TipoProduto tipoProduto;

    private BigDecimal valor;

    private LocalDate dataCriacao;

}
