package app;

import java.util.Scanner;

public class QuestaoDois {
    
    
    public static boolean verificaFibonacci(int num) {

        int a = 0;
        int b = 1;
        

        if (num == a || num == b) {
            return true;
        }
        

        while (b <= num) {

            int next = a + b;

            if (next == num) {
                return true;
            }

            a = b;
            b = next;
        }
        

        return false;
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        if (verificaFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
        
        
        scanner.close();
    }
}
