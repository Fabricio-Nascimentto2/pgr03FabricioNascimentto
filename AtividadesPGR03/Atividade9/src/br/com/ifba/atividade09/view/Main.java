/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author fabricio
 */
public class Main {
    public static void main(String[] args) {
        //criando perfis para os usuarios
        List<String> permissoesAdmin = Arrays.asList("CRUD_USERS", "CRUD_PROFILES", "RELATORIOS");
        PerfilUsuario admin = new PerfilUsuario(1L, "Administrador", permissoesAdmin);

        List<String> permissoesComum = Arrays.asList("VIEW_SELF", "EDIT_SELF");
        PerfilUsuario comum = new PerfilUsuario(2L, "Usuário Comum", permissoesComum);

        System.out.println("--- Perfis Criados ---");
        System.out.println(admin);
        System.out.println(comum);
        System.out.println("----------------------\n");

        // perfis dos usuarios
        Usuario joao = new Usuario(10L, admin, "joao.admin", "joao@a.com", "12345", true);
        Usuario maria = new Usuario(11L, comum, "maria.user", "maria@b.com", "senha", true);
        Usuario Giovane = new Usuario(12L, comum,"Giovane.user", "giovane@.comum","123", true);
        Usuario Fabricio = new Usuario(13L, comum, "Fabricio.user", "Fabricio@.comum", "235", true);
        Usuario Edu = new Usuario(42L, comum, "Eduardo.user", "edurdo@.comum", "222", true);
        Usuario Luiza = new Usuario(16L, comum, "luiza.user", "luiza@.comum", "11123", true);

        System.out.println("--- Usuários Criados ---");
        System.out.println(joao);
        System.out.println(maria);
        System.out.println(Giovane);
        System.out.println(Fabricio);
        System.out.println(Edu);
        System.out.println(Luiza);
        System.out.println("------------------------\n");

        // Teste de Login e LogAuditoria
        LongAuditoria logLoginJoao = joao.logar("12345");
        if (logLoginJoao != null) {
            System.out.println("\n--- Log de Login ---");
            System.out.println(logLoginJoao);
        }

        // Teste de Sessão
        Sessao sessaoMaria = maria.criarSessao();
        System.out.println("\n--- Sessão Criada (Maria) ---");
        System.out.println(sessaoMaria);

        // Teste de Login 
        joao.logar("4344");

        System.out.println("\n----------------------");

        Sessao sessaoLuiza = Luiza.criarSessao(); 
        System.out.println("\n--- Sessão Criada (Luiza) ---");
        System.out.println(sessaoLuiza);

        Sessao sessaoEdu = Edu.criarSessao();
        System.out.println("\n--- Sessão Criada (Edu) ---");
        System.out.println(sessaoEdu);

        Sessao sessaoGiovane = Giovane.criarSessao(); 
        System.out.println("\n--- Sessão Criada (Giovane) ---");
        System.out.println(sessaoGiovane);

        Sessao sessaoFabricio = Fabricio.criarSessao();
        System.out.println("\n--- Sessão Criada (Fabricio) ---");
        System.out.println(sessaoFabricio);
    }
    
}
