package view;

import controller.PessoaFisicaController;
import modells.Endereco;
import modells.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        PessoaFisicaController pfController = new PessoaFisicaController();
        PessoaFisica pf1 = new PessoaFisica();
        

        pf1.id = 1;
        pf1.nome = "Laercio";
        pf1.sobrenome = "Rios";
        pf1.cpf = "90202903902930";

        Endereco e1 = new Endereco();
        e1.rua = "Primavera";
        e1.bairro = "Feira VI";
        e1.numero = "12";
        e1.cep = "998920292002";
        pf1.enderecoPessoal = e1;

        pfController.create(pf1);
        
        
    }
}
