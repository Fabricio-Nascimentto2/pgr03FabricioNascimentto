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
public class PagamentoCartao implements Pagamento{
    private double valor;
    private final double TAXA = 0.05;

    public PagamentoCartao(double valor) { // Construtor para definir o valor inicial
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return this.valor * (1 + TAXA); // Aplica 5% de taxa
    }

    public void imprimirRecibo() {
        double valorFinal = calcularTotal();
        JOptionPane.showMessageDialog(null,
                "--- Recibo Pagamento Cartão ---\n" +
                "Valor da Compra: R$ " + String.format("%.2f", this.valor) + "\n" +
                "Taxa (5%): R$ " + String.format("%.2f", this.valor * TAXA) + "\n" +
                "Valor Total a Pagar: R$ " + String.format("%.2f", valorFinal)
        );
    }

    @Override
    public void imprimimRecibo() {
        double valor1 = this.valor;
    }
    
}
