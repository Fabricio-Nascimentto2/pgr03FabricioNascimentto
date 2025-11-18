/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author fabricio
 */
public class Triangulo extends FormaBidimensional{
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double obterAre(){
        return (base * altura) / 2.0;
    }
    
    @Override
    public String toString(){
        return " tipo: Triangulo(2D) / base: " + base +", altura: " + altura;
    }
}
