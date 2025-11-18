/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author fabricio
 */
public class Circulo extends FormaBidemensional {
    
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public double obterArea(){
        return Math.PI * raio * raio;
        
    }
    
    @Override
    public String toString(){
        return " Tipo: Circulo (2D) / Raio: " + raio;
    }
    
}
