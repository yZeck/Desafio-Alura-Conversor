/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Lucas
 */
public class ConvertMetros {

    private Double Km = 1000.00;
    private Double hm = 100.00;
    private Double Dec = 10.00;
    private Double Deci = 0.1;
    private Double cm = 0.01;
    private Double mm = 0.001;

    private double metros;
    private Double metrosConvertido;

    public Double getKm() {
        return Km;
    }

    public void setKm(Double Km) {
        this.Km = Km;
    }

    public Double getHm() {
        return hm;
    }

    public void setHm(Double hm) {
        this.hm = hm;
    }

    public Double getDec() {
        return Dec;
    }

    public void setDec(Double Dec) {
        this.Dec = Dec;
    }

    public Double getDeci() {
        return Deci;
    }

    public void setDeci(Double Deci) {
        this.Deci = Deci;
    }

    public Double getCm() {
        return cm;
    }

    public void setCm(Double cm) {
        this.cm = cm;
    }

    public Double getMm() {
        return mm;
    }

    public void setMm(Double mm) {
        this.mm = mm;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public Double getMetrosConvertido() {
        return metrosConvertido;
    }

    public void setMetrosConvertido(Double metrosConvertido) {
        this.metrosConvertido = metrosConvertido;
    }

    public void ConversorMedida(double x) {
        this.metrosConvertido = this.metros / x;
    }

    public void ConversorMetrosPara(double x) {
        this.metrosConvertido = this.metros * x;
    }

}
