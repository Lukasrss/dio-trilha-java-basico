package edu.lucas.primeiroscod;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Lucas";
        String segundoNome = "Roberto";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Nome Completo: " + primeiroNome + " " + segundoNome;
    }

}



