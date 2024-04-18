/*
Classe de operações criadas para aplicar conceitos mais avançados ao projeto.
Aqui serão criados os métodos das operações a serem executadas.
 */
package calculadora.java;
/**
 *
 * @author fabio
 */
public abstract class Operacoes {
    
    //Métodos de Operações da Calculadora Básica
    public double soma(double num1, double num2){
        return num1 + num2;
    }
    
    public double subtracao(double num1, double num2){
        return num1 - num2;
    }
    
    public double divisao(double num1, double num2){
        return num1 / num2;
    }
    
    public double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    
    //Métodos de Operações da Calculadora científica
    public double raizQuadrada(double num1){
        return Math.sqrt(num1);
    }
    
    public double potencia(double num1, double num2){
        return Math.pow(num1, num2);
    }
    
    public double absoluto(double num1){
        return Math.abs(num1);
    }
    
    public double pi(){
        return Math.PI;
    }
    
    public double raizCubica(double num1){
        return Math.cbrt(num1);
    }
    
}
