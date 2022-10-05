package edu.hilario.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // && = E e || = OU
        boolean condicao_1 = true;
        boolean condicao_2 = false;

        if (condicao_1 && condicao_2) {
            System.out.println("As duas condições são verdadeiras.");

        } else if (condicao_1 || condicao_2) {
            System.out.println("Uma das duas condições é verdadeira.");
        }
    }
    
}
