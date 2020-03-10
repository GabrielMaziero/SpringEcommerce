package br.com.rd.ecommerce.repository;

import br.com.rd.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByCodProduto(Integer codProduto);

    List<Produto> findByDescricao(Integer descricao);

}
