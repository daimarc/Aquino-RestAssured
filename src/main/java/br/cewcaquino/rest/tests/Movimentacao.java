package br.cewcaquino.rest.tests;


public class Movimentacao {

    private String envolvido;
    private String tipo;
    private String data_transacao;
    private String data_pagamento;
    private Float valor;
    private Boolean status;
    private Integer conta_id;;
    private Integer usuario_id;
    private Integer id;
    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEnvolvido() {
        return envolvido;
    }

    public void setEnvolvido(String envolvido) {
        this.envolvido = envolvido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData_transacao() {
        return data_transacao;
    }

    public void setData_transacao(String data_transacao) {
        this.data_transacao = data_transacao;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getConta_id() {
        return conta_id;
    }

    public void setConta_id(Integer conta_id) {
        this.conta_id = conta_id;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }



}