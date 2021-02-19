package edu.eci.escuelaing.arep.recursos;

public class Calculadora {
    public static double calculadora(String op,String num){
        double valor = 0;
        switch (op){
            case "sin":{
                valor = Math.sin(Double.parseDouble(num));
                break;
            } case "cos":{
                valor = Math.cos(Double.parseDouble(num));
                break;
            } case "tan":{
                valor = Math.tan(Double.parseDouble(num));
                break;
            }
        }
        return valor;
    }
}
