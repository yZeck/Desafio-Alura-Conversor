/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Lucas
 */
public class ConvertTemperatura {
    
    private double temperatura;
    private double C;
    private double F;
    private double K;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    public double getF() {
        return F;
    }

    public void setF(double F) {
        this.F = F;
    }

    public double getK() {
        return K;
    }

    public void setK(double K) {
        this.K = K;
    }
    
    
    public double CelsiusEmF(){
        return ((this.C * 1.8)+ 32);
    }
    public double FarenhEmC(){
        return ((this.F-32)/1.8);
    }
    public double CelsiusEmK(){
        return (this.C + 273.15);
    }
    public double KelvinEmC(){
        return (this.K - 273.15);
    }
    
}
