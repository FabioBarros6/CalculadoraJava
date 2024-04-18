/*
Classe criada a parte para simular uma nova configuração que pode ser selecionada
pelo usuário, onde serão realizadas operações avançadas de calculadora cientifica.
 */
package calculadora.java;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class CalculadoraCientifica extends Operacoes{
    
    //Método de apresentação
    public void apresentarOperacoes(){
        
        System.out.println("==============================================");
        System.out.println("Escolha a operacao que deseja realizar:");
        System.out.println("[1] - RAIZ QUADRADA");
        System.out.println("[2] - POTENCIA");
        System.out.println("[3] - VALOR ABSOLUTO");
        System.out.println("[4] - PI");
        System.out.println("[5] - RAIZ CUBICA");
        System.out.println("==============================================");
        fazerOperacoes();
    }
    
    public void fazerOperacoes(){
        String opcao;
        String operacao;
        double num1;
        double num2;
        double resultado;
       
        
        Scanner teclado = new Scanner(System.in);
        opcao = teclado.next();
        System.out.println("Digide um numero:");
        num1 = teclado.nextDouble();
 
         switch (opcao){
            case "1":
                resultado = super.raizQuadrada(num1);
                System.out.println("A raiz quadrada de " + num1 + " e " + resultado);
                break;
            case "2":
                System.out.println("Digite o numero da potencia:");
                num2 = teclado.nextDouble();
                resultado = super.potencia(num1, num2);
                System.out.println(num1 + " elevado a " + num2 + " e " + resultado);
                break;
            case "3":
                resultado = super.absoluto(num1);
                System.out.println("O valor absoluto de " + num1 + " e " + resultado);
                break;
            case "4":
                resultado = super.pi();
                System.out.println("Valor de PI " + resultado);
                break;
            case "5":
                resultado = super.raizCubica(num1);
                System.out.println("A raiz cubica de " + num1 + " e " + resultado);
                break;
            default:
                System.out.println("Opcao Invalida.");
                return;
        }

    }
    
    
  
    
 
}
    
    
   

