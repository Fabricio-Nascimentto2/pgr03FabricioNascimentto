/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author fabricio
 */
public class Esfera extends FormaTridemensional{
    private double raio;
    
    public Esfera(double raio){
        this.raio = raio;
    }
    
    @Override
    public double obterArea(){
        return 4.0 * Math.PI * raio * raio;
    }
    
    public double obterVolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
    
    @Override
    public String toString(){
        return "tipo: Esfera (3D) / raio " + raio;
    }
}
