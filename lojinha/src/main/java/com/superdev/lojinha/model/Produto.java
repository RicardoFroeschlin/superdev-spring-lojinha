package com.superdev.lojinha.model;

public class Produto {

    private int id;
    private String nome;
    private Double preco;
    private boolean status;

    public Produto() {

    }

    public Produto(int id, String nome, Double preco, boolean status) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
