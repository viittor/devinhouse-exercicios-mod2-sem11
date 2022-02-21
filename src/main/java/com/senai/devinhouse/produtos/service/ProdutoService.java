package com.senai.devinhouse.produtos.service;

import com.senai.devinhouse.produtos.dto.ProdutoDTO;
import com.senai.devinhouse.produtos.model.Produto;
import com.senai.devinhouse.produtos.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public void adicionarProduto(ProdutoDTO produtoDTO) {

        Produto produto = new Produto();

        produtoRepository.save(produto);
    }

}
