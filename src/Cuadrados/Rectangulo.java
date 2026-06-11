/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuadrados;

import figurasgeometricas.Figuras;

/**
 *
 * @author Aaron
 */
public class Rectangulo extends Figuras {
protected double base;
protected double altura;

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    public double getDiagonal(){
        return calcularDiagonal();
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    private double calcularDiagonal(){
        return Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
    }
    @Override
    protected double calcularPerimetro() {
       return (base*2)+(altura*2);
    }

    @Override
    protected double calcularArea() {
        return base+altura;
    }

    @Override
    public String toString() {
        return "Rectangulo"+"Base:"+base
        +"\nAltura:"+altura
        +"\nPerimetro:"+getPerimetro()
        +"\nDiagonal:"+calcularDiagonal()
        +"\nArea:"+getArea()
        +"\n";
    }
    
}
