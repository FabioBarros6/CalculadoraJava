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
        
        
        Scanner teclado = new Scanner(System.in); //criação do objeto teclado para poder receber os numeros a serem calculados 
        System.out.println("Digite o primeiro valor: ");
        double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double num2 = teclado.nextDouble();
        System.out.println("Infome a operacao: + | - | / | *");
        String operacao = teclado.next();
        double resultado;
        
        // estrutura condicional que realiza o calculo de acordo com a operação informada.
        switch (operacao){
            case "+":
                operacao = "soma";
                resultado = num1 + num2;
                break;
            case "-":
                operacao = "subtracao";
                resultado = num1 - num2;
                break;
            case "/":
                operacao = "divisao";
                resultado = num1 / num2;
                break;
            case "*":
                operacao = "multiplicacao";
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Operacao inválida!");
                return;

        }
        System.out.println("O resultado da " + operacao + " e " + resultado);
    }
}
