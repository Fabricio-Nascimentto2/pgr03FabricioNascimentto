/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author fabricio
 */
public class ContaBanco{

    private int numConta;
    private String tipo; 
    private String dono;
    private double saldo;
    private int status; 

    
    private final double PRESENTE_CP = 150.00;
    private final double PRESENTE_CC = 50.00;
    private final double MENSALIDADE_CC = 12.00;
    private final double MENSALIDADE_CP = 20.00;

    // Construtores
    public ContaBanco(int numConta, String dono){
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = 0.00;
        this.status = 0;
        System.out.println("Conta de " + this.dono + " criada com sucesso. Status: FECHADA.");
    }

    //   getters e setters
    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void exibirStatus(){
        System.out.println("----------------------------------------");
        System.out.println("Conta No: " + this.numConta);
        System.out.println("Dono: " + this.dono);
        System.out.println("Tipo: " + (this.tipo != null ? this.tipo.toUpperCase() : "N/A"));
        System.out.println("Status: " + (this.status == 1 ? "ABERTA" : "FECHADA"));
        System.out.println("Saldo: R$ " + String.format("%.2f", this.saldo));
        System.out.println("------------------------------------");
    }

    //  Abrir Conta (Regras 1 e 2)
    public void abrirConta(String t){
        if(t.equals("cc") || t.equals("cp")){
            this.setTipo(t);
            this.setStatus(1);

            if (t.equals("cc")){
                this.saldo += PRESENTE_CC;
                System.out.println("Conta Corrente aberta com sucesso para " + this.getDono() + "! Bônus de R$ " + PRESENTE_CC + " adicionado. Saldo: R$ " + String.format("%.2f", this.saldo));
            }else{ // t.equals("cp")
                this.saldo += PRESENTE_CP;
                System.out.println("Conta Poupança aberta com sucesso para " + this.getDono() + "! Bônus de R$ " + PRESENTE_CP + " adicionado. Saldo: R$ " + String.format("%.2f", this.saldo));
            }
        }else{
            System.out.println("ERRO: Tipo de conta inválido. Use 'cc' para Corrente ou 'cp' para Poupança.");
        }
    }

    //  Fechar Conta 
    public void fecharConta(){
        if(this.getStatus() == 0){
            System.out.println("ERRO: A conta de " + this.getDono() + " já está fechada.");
        }else if (this.getSaldo() > 0){
            System.out.println("ERRO: Para fechar a conta, o saldo deve ser R$ 0,00. Retire R$ " + String.format("%.2f", this.getSaldo()) + " primeiro.");
        }else if (this.getSaldo() < 0){
            System.out.println("ERRO: Para fechar a conta, o saldo deve ser R$ 0,00. Regularize seu débito de R$ " + String.format("%.2f", Math.abs(this.getSaldo())) + " primeiro.");
        }else{
            this.setStatus(0);
            System.out.println("Conta de " + this.getDono() + " fechada com sucesso!");
        }
    }

    //  Depositar 
    public void depositar(double v){
        if(this.getStatus() == 1){
            this.saldo += v;
            System.out.println("Depósito de R$ " + String.format("%.2f", v) + " realizado na conta de " + this.getDono() + ". Saldo atual: R$ " + String.format("%.2f", this.saldo));
        }else{
            System.out.println("ERRO: Não é possível depositar na conta de " + this.getDono() + ". Conta fechada.");
        }
    }

    //  Sacar 
    public void sacar(double v){
        if (this.getStatus() == 1){
            if(this.getSaldo() >= v){
                this.saldo -= v;
                System.out.println("Saque de R$ " + String.format("%.2f", v) + " realizado na conta de " + this.getDono() + ". Saldo atual: R$ " + String.format("%.2f", this.saldo));
            }else{
                System.out.println("ERRO: Saldo insuficiente. Tentativa de saque: R$ " + String.format("%.2f", v) + ". Saldo atual: R$ " + String.format("%.2f", this.getSaldo()));
            }
        }else{
            System.out.println("ERRO: Não é possível sacar da conta de " + this.getDono() + ". Conta fechada.");
        }
    }

    //  Pagar Mensalidade 
    public void pagarMensal(){
        if (this.getStatus() == 0){
            System.out.println("ERRO: Não é possível pagar mensalidade, conta fechada.");
            return;
        }

        double mensalidade = 0;
        // Verifica se o tipo de conta foi definido (para evitar NullPointerException)
        if(this.getTipo() != null){
            if(this.getTipo().equals("cc")){
                mensalidade = MENSALIDADE_CC;
            }else if(this.getTipo().equals("cp")){
                mensalidade = MENSALIDADE_CP;
            }
        }else{
            System.out.println("ERRO: Tipo de conta não definido. Não é possível cobrar mensalidade.");
            return;
        }

        if(this.getSaldo() >= mensalidade){
            this.saldo -= mensalidade;
            System.out.println("Mensalidade de R$ " + String.format("%.2f", mensalidade) + " cobrada com sucesso da conta de " + this.getDono() + ". Saldo atual: R$ " + String.format("%.2f", this.saldo));
        }else{
            System.out.println("ERRO: Saldo insuficiente para pagar a mensalidade de R$ " + String.format("%.2f", mensalidade) + " da conta de " + this.getDono() + ". Saldo atual: R$ " + String.format("%.2f", this.saldo));
        }
    }
}
