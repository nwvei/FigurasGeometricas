/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulos;

/**
 *
 * @author Aaron
 */
public class Isosceles extends Triangulo {
    public Isosceles (double ladoAB,double ladoC){
        super (ladoAB,ladoAB,ladoC);
    }
    @Override
    protected double calcularArea() {
        return ladoC*(Math.sqrt(4*Math.pow(ladoA,2)-Math.pow(ladoC,2))/4);
    }
    @Override
    public String toString() {
        return "Triangulo Isoceles"+"LadoA:"+ladoA
        +"\nLadoB:"+ladoB
        +"\nLadoC"+ladoC
        +"\nArea:"+getArea()
        +"\nPerimetro"+getPerimetro()
        +"\n";
    }
}
