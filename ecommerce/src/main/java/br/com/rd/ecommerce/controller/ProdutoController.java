package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.Produto;
import br.com.rd.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    @ResponseStatus(HttpStatus.CREATED)

    @PostMapping("/create-produto")
    private Produto save(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @GetMapping("/produto-list")
    public List<Produto> find() {

        return produtoRepository.findAll();
    }
}
