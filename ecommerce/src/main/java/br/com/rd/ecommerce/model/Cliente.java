package br.com.rd.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cliente")


public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "ds_nome")
    private String nome;
    @NotNull
    @Column(name = "ds_cpf")
    private String cpf;
    @NotNull
    @Column(name = "dt_data_nasc")
    private Date dataNasc;
    @NotNull
    @Column(name = "ds_email")
    private String email;
    @NotNull
    @Column(name = "ds_senha")
    private String senha;
    @NotNull
    @Column(name = "ds_sexo")
    private String sexo;
}