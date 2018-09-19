package CalculadoraInterface;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Calculadora implements Operacoes{


    @Override
    public int soma(int a, int b) {

        return a + b;
    }

    @Override
    public int subtracao(int a, int b) {


        return a - b;


    }

    @Override
    public int potencia(int a, int b) {
        int resultado= (int) Math.pow(a,b);
        return resultado;
    }

    @Override
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    @Override
    public float divisao(int a, int b) {
        return a / b;
    }

    @Override
    public int raiz(int a) {
        int resultado = (int) Math.sqrt(a);
        return resultado;
    }

    @Override
    public double log(double a) {
        double resultado =  Math.log1p(a);
        return resultado;
    }

    @Override
    public double seno(double a) {
        double resultado = Math.sin(a);
        return resultado;
    }
}
