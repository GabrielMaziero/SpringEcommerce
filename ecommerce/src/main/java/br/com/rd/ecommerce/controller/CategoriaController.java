package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.Categoria;
import br.com.rd.ecommerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @ResponseStatus(HttpStatus.CREATED)


    @PostMapping("/create-categoria")
    private Categoria save(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @GetMapping("/categoria-list")
    public List<Categoria> find() {

        return categoriaRepository.findAll();
    }
}
