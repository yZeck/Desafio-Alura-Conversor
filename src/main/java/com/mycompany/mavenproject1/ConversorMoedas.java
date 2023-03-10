/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Lucas
 */
public class ConversorMoedas {
	
	private  double DOLLAR = 0.192300;
	private  double LIBRAESTERLINA = 0.159758;
	private  double PESOARGENTINO=38.1285;
	private  double CHILENO=154.44;
	private  double EURO=0.180681;
	private double Real;
        private double RealConvertido;
	private double valor;
	private double valorConvertido;
    
    //get and set
	
    
    public double getDOLLAR() {
		return DOLLAR;
	}
	public void setDOLLAR(double dOLLAR) {
		DOLLAR = dOLLAR;
	}
	public double getLIBRAESTERLINA() {
		return LIBRAESTERLINA;
	}
	public void setLIBRAESTERLINA(double lIBRAESTERLINA) {
		LIBRAESTERLINA = lIBRAESTERLINA;
	}
	public double getPESOARGENTINO() {
		return PESOARGENTINO;
	}
	public void setPESOARGENTINO(double pESOARGENTINO) {
		PESOARGENTINO = pESOARGENTINO;
	}
	public double getCHILENO() {
		return CHILENO;
	}
	public void setCHILENO(double cHILENO) {
		CHILENO = cHILENO;
	}
	public double getEURO() {
		return EURO;
	}
	public void setEURO(double eURO) {
		EURO = eURO;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValorConvertido() {
		return valorConvertido;
	}
	public void setValorConvertido(double valorConvertido) {
		this.valorConvertido = valorConvertido;
	}
	public void ConversorMoedaReal(double x) {
      	 this.RealConvertido = this.Real/x;
      }
   
	public void ConversorRealMoedaInt(double x) {
	   	 this.valorConvertido = this.valor*x;
	   }

    public double getReal() {
        return Real;
    }

    public void setReal(double Real) {
        this.Real = Real;
    }

    public double getRealConvertido() {
        return RealConvertido;
    }

    public void setRealConvertido(double RealConvertido) {
        this.RealConvertido = RealConvertido;
    }
        
}
