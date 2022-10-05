package edu.hilario.operadores;

public class OperadoresUnarios {
    //Operadores unários de valor positivo(+) e negativo(-)
    //Operador unário incrementativo (++)
    //Operador unário decrementativo (--)
    //operador lógico de negação (!)
    
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(- numero); //não afeta a variável principal

        numero++; //Incremento
        System.out.println(numero); //Mesma coisa System.out.println(++ numero);

        numero--; //Decremento
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel); //! operador de negação
    }

}
