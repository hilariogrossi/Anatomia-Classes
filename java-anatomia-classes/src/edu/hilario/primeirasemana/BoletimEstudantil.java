package edu.hilario.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        double mediaFinal = 5.25;
        if (mediaFinal < 6)
            System.out.println("Você foi Reprovado!");
        else if (mediaFinal == 6)
            System.out.println("Você está de Prova Final!");
        else
            System.out.println("Você foi APROVADO!");
    }
}
