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
public class PagamentoPix implements Pagamento{
    private double valor;
    private final double CASHBACK = 0.02;

    public PagamentoPix(double valor) { // Construtor para definir o valor inicial
        this.valor = valor;
    }

    public double calcularTotal() {
        // O valor total a pagar é o valor original. O cashback é um benefício.
        return this.valor;
    }

    public void imprimirRecibo() {
        double valorFinal = calcularTotal();
        double valorCashback = this.valor * CASHBACK;
        JOptionPane.showMessageDialog(null,
                "--- Recibo Pagamento Pix ---\n"
                + "Valor da Compra: R$ " + String.format("%.2f", this.valor) + "\n"
                + "Valor Total a Pagar: R$ " + String.format("%.2f", valorFinal) + "\n"
                + "Cashback Recebido (2%): R$ " + String.format("%.2f", valorCashback)
        );
    }

    @Override
    public void imprimimRecibo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
