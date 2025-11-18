/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author fabricio
 */
public class TestFormas {
    public static void main(String[] args) {
        Forma[] formas = new Forma[6];

        // Os valores são exemplos, você pode ajustá-los.
        formas[0] = new Circulo(5.0);
        formas[1] = new Quadrado(4.0);
        formas[2] = new Triangulo(6.0, 8.0);
        formas[3] = new Esfera(3.0);
        formas[4] = new Cubo(2.0);
        // Exemplo: Piramide(ladoBase, altura, apotema)
        formas[5] = new Piramide(5.0, 4.0, 5.2);

        System.out.println("--- Processamento de Formas Geométricas ---");

        // 3. Itera sobre o array e processa cada forma (Polimorfismo)
        for (Forma forma : formas) {

            System.out.println("\n" + forma.toString()); 
            // Verifica o tipo de forma e faz o casting para acessar métodos específicos
            switch (forma) {
                case FormaBidimensional forma2D -> 
                    System.out.printf("Área: %.2f\n", forma2D.obterArea());
                case FormaTridimensional forma3D -> {
// Se for 3D
System.out.printf("Área Superficial: %.2f\n", forma3D.obterArea());
System.out.printf("Volume: %.2f\n", forma3D.obterVolume());
                }
                default -> {
                }
            }
            System.out.println("----------------------------------------");
        }
    }
}
