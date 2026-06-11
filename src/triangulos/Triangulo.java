/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulos;
import figurasgeometricas.Figuras;

/**
 *
 * @author Aaron
 */
public abstract class Triangulo extends Figuras{
    protected double ladoA;
    protected double ladoB;
    protected double ladoC;

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }
    @Override
    protected double calcularPerimetro(){
        return ladoA+ladoB+ladoC;
    }
    public Triangulo(double ladoA,double ladoB,double ladoC){
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
    }
}
