package com.saas.delivery.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estabelecimento") // Nome exato da tabela no PostgreSQL
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Equivale ao SERIAL do Postgres
    private Long id;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Column(name = "cor_primaria")
    private String corPrimaria;

    @Column(name = "url_logo")
    private String urlLogo;

    @Column(name = "tipo_layout")
    private String tipoLayout;

    @Column(name = "telefone_whatsapp")
    private String telefoneWhatsapp;

    private Boolean ativo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCorPrimaria() {
        return corPrimaria;
    }

    public void setCorPrimaria(String corPrimaria) {
        this.corPrimaria = corPrimaria;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public String getTipoLayout() {
        return tipoLayout;
    }

    public void setTipoLayout(String tipoLayout) {
        this.tipoLayout = tipoLayout;
    }

    public String getTelefoneWhatsapp() {
        return telefoneWhatsapp;
    }

    public void setTelefoneWhatsapp(String telefoneWhatsapp) {
        this.telefoneWhatsapp = telefoneWhatsapp;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
