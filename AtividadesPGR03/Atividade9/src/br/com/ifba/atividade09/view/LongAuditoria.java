/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

import java.time.LocalDateTime;

/**
 *
 * @author fabricio
 */
public class LongAuditoria {
    private Long id;
    private Usuario usuario; 
    private LocalDateTime dataHora; 
    private String acao;
    private String ip;

    // construtores
    public LongAuditoria(Long id, Usuario usuario, LocalDateTime dataHora, String acao, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.dataHora = dataHora;
        this.acao = acao;
        this.ip = ip;
    }

    
    public LongAuditoria() {
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


    @Override
    public String toString() {
        return "LogAuditoria{"
                + "id=" + id
                + ", usuario=" + (usuario != null ? usuario.getNomeUsuario() : "N/A")
                + ", dataHora=" + dataHora
                + ", acao='" + acao + '\''
                + ", ip='" + ip + '\''
                + '}';
    }
}
