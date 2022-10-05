package edu.hilario.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        // System.out.print("Olá world!");

        // int ano = 2021;
        // ano = 2022;

        // final String BR = "Brasil"; // final = const -> Significa que a variável BR
        // não poderá ser mudada.

        // int numero$1 = 1; // e não pode int numero&1
        // int numero1 = 1; // e não pode int 1numero
        // int numeroum = 1; // e não pode int numero um
        // int long = 1; // e não pode long que é palavra reservada

        // int idade = 51; // int é número inteiro
        // double altura = 1.73; //doble é float
        // Dog spike; // Dog é uma classe e spike é a variável e está sem valor

        // String meuNome = "Hilário";

        // int anoFabricacao = 2022;

        // boolean verdadeira = true;
        // boolean falsa = false;

        // anoFabricacao = 2023;

        // Métodos devem ser declaradas sempre no infinitivo
        // int somar (int numeroUm, int numero2);
        // String formatarCep (long cep);

        String primeiroNome = "Hilário";
        String nomeMeio = "Grossi de";
        String ultimoNome = "Oliveira";

        String nomeCompleto = nomeCompleto(primeiroNome, nomeMeio, ultimoNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String nomeMeio, String ultimoNome) {
        return "Resultado do Método = " + primeiroNome.concat(" ").concat(nomeMeio).concat(" ").concat(ultimoNome) + ".";
    }
}
