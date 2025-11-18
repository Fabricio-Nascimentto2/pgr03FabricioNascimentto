/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author fabricio
 */
public class Cubo extends FormaTridimensional{
    private double lado;
    
    public Cubo(double lado){
        this.lado = lado;
    }
    
    public double obterarea(){
        return 6.0 * lado * lado;
    }
    
    public double ObterVolume(){
        return lado * lado;
    }
    
    @Override
    public String toString(){
        return "tipo: Cubo(3d) / lado" + lado;
    }
    
}
