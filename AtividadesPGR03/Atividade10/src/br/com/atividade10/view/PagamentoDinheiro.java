/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.atividade10.view;

import javax.swing.JOptionPane;

/**
 *
 * @author fabricio
 */
public class PagamentoDinheiro implements Pagamento {
    private double valor;
    private final double DESCONTO = 0.10;
    
    public PagamentoDinheiro(double valor){ // Construtor para definir o valor inicial
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return this.valor * (1 - DESCONTO); // Aplica 10% de desconto
    }
    
    public void imprimirRecibo() {
        double valorFinal = calcularTotal();
        JOptionPane.showMessageDialog(null,
                "--- Recibo Pagamento Dinheiro ---\n"
                + "Valor da Compra: R$ " + String.format("%.2f", this.valor) + "\n"
                + "Desconto (10%): R$ " + String.format("%.2f", this.valor * DESCONTO) + "\n"
                + "Valor Total a Pagar: R$ " + String.format("%.2f", valorFinal)
        );
    }

    @Override
    public void imprimimRecibo(){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
