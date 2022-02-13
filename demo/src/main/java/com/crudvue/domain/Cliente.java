package com.crudvue.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "idade")
    private Integer idade;
    @Column(name = "ativo")
    private Boolean ativo;

    public Cliente() {
    }

    public Cliente(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Getters
    public long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public Boolean getAtivo() {
        return this.ativo;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}
