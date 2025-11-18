/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author fabricio
 */
public class Piramide extends FormaTridimensional{
    private double baseLado; // Assume base quadrada
    private double altura;
    private double apotema; // Necessário para área superficial

    public Piramide(double baseLado, double altura, double apotema) {
        this.baseLado = baseLado;
        this.altura = altura;
        this.apotema = apotema;
    }

    public double obterArea() {
        // Área superficial = Área da Base + Área Lateral
        // Área da Base (quadrado): baseLado^2
        double areaBase = baseLado * baseLado;
        // Área Lateral (4 triângulos): 4 * (baseLado * apotema) / 2
        double areaLateral = 2.0 * baseLado * apotema;
        return areaBase + areaLateral;
    }

    @Override
    public double obterVolume() {
        // Volume: (1/3) * Área da Base * Altura
        double areaBase = baseLado * baseLado;
        return (1.0 / 3.0) * areaBase * altura;
    }

    @Override
    public String toString() {
        return "Tipo: Pirâmide (3D) | Lado Base: " + baseLado + ", Altura: " + altura;
    }
}
