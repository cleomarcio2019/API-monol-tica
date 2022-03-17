package com.marcio.treino.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcio.treino.api.model.Produto;
import com.marcio.treino.api.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> obterPorId(Integer id){
        return produtoRepository.findById(id);
    }

    public void deletar(Integer id){
        produtoRepository.deleteById(id);
    }

    public Produto adicionar(Produto produto){
        return produtoRepository.save(produto);
    }

}
