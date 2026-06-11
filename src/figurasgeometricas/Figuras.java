/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Student
 */
public abstract class Figuras {
    private double getArea() {
        return calcularArea();
    }

    private double getPerimetro() {
        return calcularPerimetro();
    }
protected abstract double calcularPerimetro();
protected abstract double calcularArea();
}

