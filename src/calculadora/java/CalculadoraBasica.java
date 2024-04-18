/*
Classe onde ficarão os métodos de realização de calculo básico da calculadora.
 */
package calculadora.java;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class CalculadoraBasica extends Operacoes{
    //Métodos de apresentação
    public void apresentarOperacoes(){
        
        System.out.println("==============================================");
        System.out.println("Escolha a operacao que deseja realizar:");
        System.out.println("[1] - SOMA");
        System.out.println("[2] - SUBTRACAO");
        System.out.println("[3] - DIVISAO");
        System.out.println("[4] - MULTIPLICACAO");
        System.out.println("==============================================");
        fazerOperacaoes();
    }
    
    public void fazerOperacaoes(){
        String opcao;
        String operacao;
        double num1;
        double num2;
        double resultado;
       
        
        Scanner teclado = new Scanner(System.in);
        opcao = teclado.next();
        System.out.println("Digide o primeiro numero:");
        num1 = teclado.nextDouble();
        System.out.println("Digide o segundo numero:");
        num2 = teclado.nextDouble();
 
         switch (opcao){
            case "1":  
                operacao = " + ";
                resultado = super.soma(num1, num2);
                break;
            case "2":
                operacao = " - ";
                resultado = super.subtracao(num1, num2);
                break;
            case "3":
                operacao = " / ";
                resultado = super.divisao(num1, num2);
                break;
            case "4":
                operacao = " x ";
                resultado = super.multiplicacao(num1, num2);
                break;
            default:
                System.out.println("Opcao Invalida.");
                return;
        }
        System.out.println("\n1RESULTADO:");
        System.out.println(num1 + operacao + num2 + " = " + resultado);
       
    }

}
