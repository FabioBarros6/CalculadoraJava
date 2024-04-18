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
        String opcao;
        System.out.println("==============================================");
        System.out.println("Escolha uma opcao para Iniciar a calculadora:");
        System.out.println("[1] - Calculadora Basica");
        System.out.println("[2] - Calculadora Cientifica");
        System.out.println("[3] - Sair");
        System.out.println("==============================================");
        
        
        Scanner teclado = new Scanner(System.in);
        CalculadoraBasica basica = new CalculadoraBasica();
        CalculadoraCientifica cientifica = new CalculadoraCientifica();
        opcao = teclado.next();
        
        switch (opcao){
            case "1":
                System.out.println("=== Calculadora Basica ===");
                basica.apresentarOperacoes();
                break;
            case "2":
                System.out.println("=== Calculadora Cientifica ===");
                cientifica.apresentarOperacoes();
                break;
            case "3":
                System.out.println("Saindo ...");
                break;
            default:
                System.out.println("Opcao Invalida.");
                return;
            
        }
             
    }
}
