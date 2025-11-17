/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author fabricio
 */
public class Sessao {
    private Long id;
    private Usuario usuario; // RELACIONAMENTO: Possui 1 Usuário
    private String token;

    // construtures
    public Sessao(Long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    
    public Sessao() {
    }

    // GETTERS, SETTERS e toString()
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    // MÉTODO toString()
    @Override
    public String toString() {
        return "Sessao{"
                + "id=" + id
                + ", token='" + token + '\''
                + ", usuario=" + (usuario != null ? usuario.getNomeUsuario() : "N/A")
                + '}';
    }
    
}
