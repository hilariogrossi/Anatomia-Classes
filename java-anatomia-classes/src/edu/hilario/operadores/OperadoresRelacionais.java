package edu.hilario.operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        // ==, !=, >, >=, <, <=
        int numero_1 = 10;
        int numero_2 = 20;

        boolean simNao = numero_1 == numero_2;
        System.out.println("Número 1 é igual ao Número 2? " + simNao);

        simNao = numero_1 != numero_2;
        System.out.println("Número 1 é diferente do Número 2? " + simNao);


        if (numero_1 > numero_2)
            System.out.println("Número 1 MAIOR que o número 2.");

        else if (numero_1 < numero_2)
            System.out.println("Número 1 MENOR que o número 2.");

        else if (numero_1 == numero_2)
            System.out.println("O número 1 é igual ao número 2.");

        else if (numero_1 != numero_2)
            System.out.println("O número 1 é diferente do número 2.");

        else
            System.out.println("NDA!");

        
        String nomeUm = "Hilário";
        String nomeDois = "Grossi";

        System.out.println(nomeUm == nomeDois);

    }

}
