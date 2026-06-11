/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuadrados;


/**
 *
 * @author Aaron
 */
public class Cuadrado extends Rectangulo{

    public Cuadrado(double lado) {
        super(lado,lado);
    }

    @Override
    protected double calcularPerimetro() {
       return base*4;
    }

    @Override
    protected double calcularArea() {
   return Math.pow(base,2);
    }

    @Override
    public String toString() {
        return "Cuadrado"+"Lado:"+base
        +"Perimetro:"+calcularPerimetro()
        +"Area:"+calcularArea()
        +"\n";
    }
    
}
