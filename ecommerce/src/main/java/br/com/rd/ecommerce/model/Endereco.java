package br.com.rd.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_endereco")

public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "ds_logadouro")
    private String logadouro;
    @NotNull
    @Column(name = "nr_numero")
    private Integer numero;
    @NotNull
    @Column(name = "ds_bairro")
    private String bairro;
    @NotNull
    @Column(name = "ds_complemento")
    private String complemento;
    @NotNull
    @Column(name = "ds_cidade")
    private String cidade;
    @NotNull
    @Column(name = "ds_estado")
    private String estado;
    @NotNull
    @Column(name = "ds_cep")
    private String cep;
}
