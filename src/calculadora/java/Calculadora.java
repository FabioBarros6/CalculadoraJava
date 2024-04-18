/*
Projeto de estudo, criação de uma calculadora básica que realiza as quatro
operações fundamentais da matemática
 */
package calculadora.java;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class Calculadora {
  
    public static void main(String[] args) {
        
        Operacoes calculo = new Operacoes();
        Scanner teclado = new Scanner(System.in); //criação do objeto teclado para poder receber os numeros a serem calculados 
        System.out.println("Digite o primeiro valor: ");
        double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double num2 = teclado.nextDouble();
        System.out.println("Infome a operacao: | + | - | / | * |");
        String operacao = teclado.next();
        double resultado;
        
        // estrutura condicional que realiza o calculo de acordo com a operação informada.
        switch (operacao){
            case "+":
                operacao = " + ";
                resultado = calculo.soma(num1, num2);
                break;
            case "-":
                operacao = " - ";
                resultado = calculo.subtracao(num1, num2);
                break;
            case "/":
                operacao = " / ";
                resultado = calculo.divisao(num1, num2);
                break;
            case "*":
                operacao = " x ";
                resultado = calculo.multiplicacao(num1, num2);
                break;
            default:
                System.out.println("Operacao inválida!");
                return;

        }
        System.out.println(num1 + operacao + num2 + " = " + resultado);
    }
}
