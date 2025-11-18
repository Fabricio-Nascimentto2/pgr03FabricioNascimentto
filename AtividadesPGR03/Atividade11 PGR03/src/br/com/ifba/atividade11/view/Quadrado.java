/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author fabricio
 */
public class Quadrado extends FormaBidimensional{
    // atributo para armazenar a dimensão
    private double lado;

    // Construtor que aceita um double (lado)
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // O método obterArea() deve estar implementado aqui
    @Override
    public double obterArea(){
        return lado * lado;
    }

    // O método toString() 
    @Override
    public String toString() {
        return "Tipo: Quadrado (2D) | Lado: " + lado;
    }
}
