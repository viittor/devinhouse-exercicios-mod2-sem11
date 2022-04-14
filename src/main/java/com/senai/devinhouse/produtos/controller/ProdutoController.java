package com.senai.devinhouse.produtos.controller;

import com.senai.devinhouse.produtos.model.Produto;
import com.senai.devinhouse.produtos.repository.ProdutoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProdutoController {

    private static Logger Logger = LoggerFactory.getLogger(ProdutoController.class);

    @Autowired
    ProdutoRepository repository;

    @GetMapping
    public Produto get(
            @RequestParam(value = "id", required = true) Long id
    ){
        Optional<Produto> produto = repository.findById(id);
        return produto.get();
    }

    @PostMapping
    public void post(
            Produto produto
    ){

        Logger.info(String.valueOf(produto));
        repository.save(produto);

    }

    @PatchMapping
    public void patch(
            Produto produto
    ){
        Optional<Produto> produto1 = repository.findById(produto.getId());

        produto1.get().setDescricao(produto.getDescricao());
        produto1.get().setTipoProduto(produto.getTipoProduto());
        produto1.get().setValor(produto.getValor());
        produto1.get().setDataCriacao(produto.getDataCriacao());

    }

    @DeleteMapping
    public  void delete(
            @RequestParam(value = "id", required = true) Long id
    ){
        repository.deleteById(id);
    }


}
