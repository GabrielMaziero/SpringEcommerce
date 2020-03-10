package br.com.rd.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_pedido_item")

public class itemPedido {


    @Column(name = "cd_pedido_item")
    @Id
    private Integer codigo;

    @Column(name = "vlProduto")
    private BigDecimal vlProduto;

    @Column(name = "vlFrete")
    private BigDecimal vlFrete;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "cod_produto")
    private Integer codProduto;

   @ManyToOne
   @JoinColumn(name = "cod_pedido")
    private Pedido pedido;
}
