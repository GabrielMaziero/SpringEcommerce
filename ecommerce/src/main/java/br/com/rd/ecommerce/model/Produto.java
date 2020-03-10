package br.com.rd.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codProduto;

    @Column(name = "ds_produto", nullable = false)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "cd_categoria")
    private Categoria categoria;

    @Column(name = "vl_produto")
    private BigDecimal valor;


}
