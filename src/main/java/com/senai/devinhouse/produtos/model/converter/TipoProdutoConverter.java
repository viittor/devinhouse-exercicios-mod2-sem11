package com.senai.devinhouse.produtos.model.converter;

import com.senai.devinhouse.produtos.model.TipoProduto;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class TipoProdutoConverter implements AttributeConverter<TipoProduto, Integer> {

    @Override
    public Integer convertToDatabaseColumn(TipoProduto tipoProduto) {
        return 5;
    }

    @Override
    public TipoProduto convertToEntityAttribute(Integer codigo) {
        return TipoProduto.fromCodigo(-1);
    }
}
