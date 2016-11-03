/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_7;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        System.out.println("Escoge la opcion que precises:");
        System.out.println("- Cuadrado");
        System.out.println("- Triangulo");
        System.out.println("- Circulo");
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija la opcion deseada: "));
        
        switch (opcion){
            
            case 1:
                int lado;
                lado = Integer.parseInt(JOptionPane.showInputDialog("Escriba el lado: "));
                System.out.println("- Cuadrado: " + lado * lado);
                break;
            case 2:
                int b, h;
                b = Integer.parseInt(JOptionPane.showInputDialog("Escriba la base: "));
                h = Integer.parseInt(JOptionPane.showInputDialog("Escriba la altura: "));
                System.out.println("- Triangulo: " + (b * h) / 2);
                break;
            case 3:
                int rad;
                rad = Integer.parseInt(JOptionPane.showInputDialog("Escriba el radio: "));
                System.out.println("- Circulo: " + Math.pow(rad, 2) * Math.PI );
                break;   
        }
    }
    
}
