/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author fabricio
 */
public class Usuario {
    private Long id;
    private PerfilUsuario perfil; 
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin; 
    private Boolean ativo; 

   //construtores
    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha, Boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }

   
    public Usuario() {
    }

    /**
     * Simula o login, atualiza ultimoLogin e gera um LogAuditoria.
     *
     * @return LogAuditoria se o login for bem-sucedido, null caso contrário.
     */
    public LongAuditoria logar(String senhaFornecida) {
        if (!this.ativo) {
            System.out.println("ERRO: Usuário inativo.");
            return null;
        }
        if (this.senha.equals(senhaFornecida)) {
            this.ultimoLogin = LocalDateTime.now(); // Atualiza o último login
            System.out.println("Login de " + this.nomeUsuario + " realizado com sucesso.");

            // Gera e retorna o LogAuditoria
            return new LongAuditoria(
                    100L, // ID de exemplo
                    this,
                    LocalDateTime.now(),
                    "Login bem-sucedido",
                    "127.0.0.1" // IP de exemplo
            );
        } else {
            System.out.println("ERRO: Senha incorreta para " + this.nomeUsuario);
            return new LongAuditoria(
                    101L,
                    this,
                    LocalDateTime.now(),
                    "Tentativa de login FALHOU",
                    "127.0.0.1"
            );
        }
    }

    /**
     * Gera um token e instancia uma nova Sessao para este usuário.
     *
     * @return O objeto Sessao criado.
     */
    public Sessao criarSessao() {
        String token = UUID.randomUUID().toString(); // Gera um token único
        System.out.println("Sessão criada para " + this.nomeUsuario + ".");
        return new Sessao(
                200L, // ID de exemplo
                this,
                token
        );
    }


    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{"
                + "id=" + id
                + ", nomeUsuario='" + nomeUsuario + '\''
                + ", email='" + email + '\''
                + ", perfil=" + (perfil != null ? perfil.getDescricao() : "Nenhum")
                + ", ultimoLogin=" + ultimoLogin
                + ", ativo=" + ativo
                + '}';
    }

    String getNomeUsuario() {
        return this.nomeUsuario;
    }
}
