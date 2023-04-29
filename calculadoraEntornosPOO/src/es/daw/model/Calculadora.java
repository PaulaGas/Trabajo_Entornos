package es.daw.model;

import java.util.Scanner;

public class Calculadora {

    //PRIPIEDASES O ATRIBUTOS
    private String tipo;
    private float operando1;
    private float operando2;

    //CONSTRUCTORES
    //constructor por defecto
    public Calculadora() {

    }

    //Constructor
    public void getTipo(String tipo) {
        this.tipo = tipo;
    }

    //GETTERS AND SETTERS
    public String getTipo() {
        return tipo;
    }

    public float getOperando1() {
        return operando1;
    }

    public void setOperando1(float operando1) {
        this.operando1 = operando1;
    }

    public float getOperando2() {
        return operando2;
    }

    public void setOperando2(float operando2) {
        this.operando2 = operando2;
    }

    public Calculadora(String tipo) {
        this.tipo = tipo;
    }

    public float sumar() {
        //float resultado = op1 + op2;
        //return resultado;
        return operando1 + operando2;

    }

    public float restar() {
        return operando1 + operando2;
    }

    public float multiplicar() {
        return operando1 + operando2;
    }

    public float dividir() {
        return operando1 + operando2;
    }

    public float resto() {
        return operando1 + operando2;
    }

}
